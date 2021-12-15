public class maxIncreaseKeepingSkyline_807 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.maxIncreaseKeepingSkyline(new int[][]
                {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}});

    }
    static class Solution {
        public int maxIncreaseKeepingSkyline(int[][] grid) {
            int res=0;
            int[] horizontal=new int[grid.length];
            int[] vertical=new int[grid.length];
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid.length;j++){
                    horizontal[i]=Math.max(horizontal[i],grid[i][j]);
                    vertical[i]=Math.max(vertical[i],grid[j][i]);
                }

            }
            for(int i=0;i<grid.length;i++){
                for(int k=0;k<grid.length;k++){
                    res+=Math.abs(grid[i][k]-Math.min(vertical[k],horizontal[i]));
                }}
            return res;
        }
    }
}
