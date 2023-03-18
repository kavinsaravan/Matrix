public class Matrix {

    public static int[][] createMatrix(int numberOfRows, int numberOfColumns) {
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        int x = 0;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                matrix[i][j] = x;
                x++;
            }
        }
        return matrix;
    }
}
