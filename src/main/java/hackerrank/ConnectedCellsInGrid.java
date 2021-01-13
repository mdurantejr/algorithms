package hackerrank;

public class ConnectedCellsInGrid {

    /*
    Test input matrix:
        1 1 0 0
        0 1 1 0
        0 0 1 0
        1 0 0 0
    Expected result: 5.
     */

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int grid[][] = new int[n][m];

        grid[0][0] = 1;
        grid[0][1] = 1;
        grid[0][2] = 0;
        grid[0][3] = 0;

        grid[1][0] = 0;
        grid[1][1] = 1;
        grid[1][2] = 1;
        grid[1][3] = 0;

        grid[2][0] = 0;
        grid[2][1] = 0;
        grid[2][2] = 1;
        grid[2][3] = 0;

        grid[3][0] = 1;
        grid[3][1] = 0;
        grid[3][2] = 0;
        grid[3][3] = 0;

        System.out.print(getCount(grid));
    }

    public static int getCount(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    int curr = navigate(matrix, i, j);
                    if (curr > max) {
                        max = curr;
                    }
                }
            }
        }
        return max;
    }

    public static int navigate(int[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) {
            return 0;
        }
        if (matrix[i][j] == 0) {
            return 0;
        }
        int count = matrix[i][j]--;
        count += navigate(matrix, i, j - 1);
        count += navigate(matrix, i, j + 1);
        count += navigate(matrix, i - 1, j);
        count += navigate(matrix, i + 1, j);
        count += navigate(matrix, i + 1, j + 1);
        count += navigate(matrix, i + 1, j - 1);
        count += navigate(matrix, i - 1, j + 1);
        count += navigate(matrix, i - 1, j - 1);
        return count;
    }

}
