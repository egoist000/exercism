class Matrix {

    private int[][] rows;
    private int[][] columns; 

    Matrix(String matrixAsString) {
        createMatrix(matrixAsString);
    }

    private void createMatrix(String s) {
        if(!s.isEmpty()) {
            String[] r = s.split("\n");
            int columnLen = r[0].split(" ").length;
            rows = new int[r.length][columnLen];
            columns = new int[columnLen][r.length];
            for(int i = 0; i < r.length; ++i) {
                String[] rowcells = r[i].split(" ");
                for(int j = 0; j < rowcells.length; ++j) {
                    int num = Integer.parseInt(rowcells[j]);
                    rows[i][j] = num;
                    columns[j][i] = num;
                }
            }
        }
    }

    int[] getRow(int rowNumber) {
        return rows[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        return columns[columnNumber - 1];
    }
}
