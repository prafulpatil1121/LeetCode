class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int firstO = -1, lastO = -1;
        while ( start <= end){
            int mid = start + (end - start)/ 2;
            if(nums[mid] == target){
               firstO = mid;
               end = mid-1;
            }else if ( target > nums[mid])
             start = mid+1;
             else
              end = mid-1;
        }
        start = 0;
        end = nums.length-1;
        while( start <= end){
            int mid = start + (end -start)/2;
            if (nums[mid] == target){
            lastO = mid; 
            start = mid +1;
        }
        else if (target > nums[mid])
        start = mid+1;
        else 
        end = mid-1;
    }
    return new int []{firstO,lastO};
}
}