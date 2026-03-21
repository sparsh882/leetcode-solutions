class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int row, int col, int k) {
        int top = row;
        int bottom = row + k - 1;

        while (top < bottom) {
            for (int j = col; j < col + k; j++) {
                int temp = grid[top][j];
                grid[top][j] = grid[bottom][j];
                grid[bottom][j] = temp;
            }
            top++;
            bottom--;
        }

        return grid;
    }
}