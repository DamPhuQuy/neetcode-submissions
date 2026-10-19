class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; 
        int m = matrix[0].length; 

        int low = 0; 
        int high = (n * m) - 1; 
        
        // 1d index = (row * col) + cols;
        // convert again to 2d: 
        // row index = index / cols; 
        // col index = index % cols; 
        // suppose to 1d array of mid index

        while (low <= high) {
            int mid = (low + high) / 2; 

            int row = mid / m; 
            int col = mid % m; 

            if (matrix[row][col] == target) {
                return true; 
            } else if (matrix[row][col] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return false; 
    }
}
