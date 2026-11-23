class Solution {
    int[] dirx = {1,2,-1,-2,1,2,-1,-2};
    int[] diry = {2,1,2,1,-2,-1,-2,-1};

    private boolean solve(int i, int j, int n, int move, int[][]grid){
        if(i<0 || j<0 || i>= n || j>=n || move!=grid[i][j]){
            return false;
        }
        if(move == n*n-1){
            return true;
        }

        for(int k =0;k<8;k++){
            int ni = i + dirx[k];
            int nj = j + diry[k];

            if(solve(ni ,nj , n, move+1, grid)){
                return true;
            }
        }
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        return solve(0, 0, n, 0, grid);
    }
}