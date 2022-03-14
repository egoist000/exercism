class Matrix:

    m_string = ''

    m_cols = []
    m_rows = []

    def __init__(self, matrix_string):
        self.m_string = matrix_string
        self.m_cols = []
        self.m_rows = []
        self.set_rows_and_cols()

    def set_rows_and_cols(self):
        rws = self.m_string.splitlines()
        m_row = []
        for row in rws:
            tmp = row.split(' ')
            for e in tmp:
                m_row.append(int(e))
            self.m_rows.append(m_row)
            m_row = []
        self.m_cols = list(map(list, zip(*self.m_rows)))

    def row(self, index):
        return self.m_rows[index - 1]

    def column(self, index):
        return self.m_cols[index - 1]
