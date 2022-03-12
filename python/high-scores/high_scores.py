def latest(scores):
    try:
        return scores[-1]
    except IndexError:
        pass


def personal_best(scores):
    try:
        return max(scores)
    except ValueError:
        pass


def personal_top_three(scores):
    top_3 = []
    i = 0
    while scores != [] and i < 3:
        max_i = max(scores)
        scores.remove(max_i)
        top_3.append(max_i)
        i += 1
    return top_3
