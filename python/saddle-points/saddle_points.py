def is_irregular_matrix(matrix):
    r_len = 0
    try:
        r_len = len(matrix[0])
    except IndexError:
        return True
    if not all(len(row) == r_len for row in matrix[1:]):
        raise ValueError("irregular matrix")
    else:
        return False

def saddle_points(matrix):
    res = []
    row_num = 1
    col_num = 1
    is_saddle = True
    if not is_irregular_matrix(matrix):
        for row in matrix:
            for i in range(len(row)):
                key = row[i]
                for j in range(len(matrix)):
                    is_saddle = is_saddle and key <= matrix[j][i]
                is_saddle = is_saddle and all(key >= e for e in row)
                if is_saddle:
                    res.append(dict(row=row_num, column=col_num))
                col_num += 1
                is_saddle = True
            row_num += 1
            col_num = 1
            is_saddle = True
    return res

test = [[4, 5, 4], [3, 5, 5], [1, 5, 4]]
print(saddle_points(test))
