class Solution {
    public int probableRow(int[][] matrix,int target){
        int start= 0,end = matrix.length-1;
        while (start <= end){
            int mid =( start + end)/2;
            if(target >= matrix[mid][0] && target <= matrix[mid][matrix[0].length-1])
            return mid;
            else if(target > matrix[mid][0])
            start = mid +1;
            else 
            end= mid-1;
        }
        return -1;
    }
    public boolean bs(int arr[],int target){
        int start = 0, end = arr.length-1;
        while(start <= end ){
                int mid = (start + end )/2;
                if(target == arr[mid])
                return true;
                else if (target > arr[mid])
                start = mid +1;
                else 
                end =mid -1;
            }
            return false;
        }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = probableRow(matrix,target);
        if(row == -1)
        return false;
        return bs (matrix[row],target);
    }
}