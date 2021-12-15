public class findNumberIn2DArray_240 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length - 1, col = 0;


        while (col < matrix[0].length && row >= 0) {
            if (matrix[row][col] < target) {
                col++;
            } else if (matrix[row][col] > target) {
                row--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        findNumberIn2DArray_240 findNumberIn2DArray_240 = new findNumberIn2DArray_240();
        findNumberIn2DArray_240.findNumberIn2DArray(new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}
        }, 5);
    }
}
