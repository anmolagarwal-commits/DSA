class Solution {
    public int equalPairs(int[][] grid) {
        int row=grid.length;
        int column = grid[0].length;
        int result[][]= new int [column][row];
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                result[i][j]=grid[j][i];
            }
        }
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(Arrays.equals(grid[i],result[j])){
                    count++;
                }
            }
        }
        return count;
    }
}