public class MatrixSum {

    public static void main(String[] args) {

        // Define matrix A
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Define matrix B
        int[][] matrixB = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int rows = matrixA.length;
        int cols = matrixA[0].length;

        int[][] result = new int[rows][cols];

        // Sum matrices
        for (int i = 0; i < rows; i = i + 1) {

            for (int j = 0; j < cols; j = j + 1) {

                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Print result
        System.out.println("Resulting matrix:");

        for (int i = 0; i < rows; i = i + 1) {

            for (int j = 0; j < cols; j = j + 1) {

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}
