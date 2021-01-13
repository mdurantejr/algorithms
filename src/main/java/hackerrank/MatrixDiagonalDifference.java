package hackerrank;

public class MatrixDiagonalDifference {

    /*
        Test input matrix:
            11 2 4
            4 5 6
            10 8 -12
        Expected result: 15.
     */

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        matrix[0][0] = 11;
        matrix[0][1] = 2;
        matrix[0][2] = 4;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        matrix[2][0] = 10;
        matrix[2][1] = 8;
        matrix[2][2] = -12;

        System.out.println(new MatrixDiagonalDifference().calculateDifference(3, matrix));
    }

    private int calculateDifference(int dim, int[][] matrix) {
        int fd = 0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (i == j) {
                    fd += matrix[i][j];
                }
            }
        }

        int sd = 0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (i + j == dim - 1) {
                    sd += matrix[i][j];
                }
            }
        }

        return Math.abs(fd - sd);
    }

}
