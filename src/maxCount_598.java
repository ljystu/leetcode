public class maxCount_598 {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }
        int row = ops[0][0];
        int col = ops[0][1];
        for (int i = 0; i < ops.length; i++) {
            row = Math.min(row, ops[i][0]);
            col = Math.min(col, ops[i][1]);
        }
        return row * col;
    }
}
