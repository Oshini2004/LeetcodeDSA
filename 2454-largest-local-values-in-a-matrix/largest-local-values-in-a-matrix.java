class Solution {



    public int[][] largestLocal(int[][] grid) {

        int n=grid.length; //rows,col

        int result[][]= new int [n-2][n-2];//new resultant matrix

        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                result[i][j] =findMax(grid,i,j); 
                 //per call 9 times chalega ,9 cells ko visit krega 
            }
        }
        return result;
    }



    public int findMax(int[][] grid, int startRow, int startCol ){
    int maxVal = Integer.MIN_VALUE;
    for(int i=startRow;i<startRow+3;i++ ){//first idx se shuru ho rha h to 3rd idx tk jana h 

    for(int j=startCol;j<startCol+3;j++){
        maxVal =Math.max(maxVal,grid[i][j]);
    }

    }
    return maxVal;
}
}