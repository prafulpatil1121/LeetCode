class Solution {
    public int shipWithinDays(int[] weights, int days) {
        return minimize(weights,days);
    }
        private static int minimize(int []arr,int m){
        if ( m > arr.length)
            return -1;
        int max = arr[0] ,sum =0;
        for (int e : arr){
            sum += e;
            max = Math.max(max,e);
        }
        int start = max,end = sum;
        int ans = -1;
        while(start <= end){
            int mid = (start +end)/ 2;
            if (isvalid(arr,m,mid)){
                ans = mid;
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return ans;
    }


    private static boolean isvalid(int[] pages, int student, int capacity) {
        int curPages = 0;
        int curStudents= 1;
        for( int page : pages){
            if(curPages+ page > capacity){
                curStudents++;
                curPages = page;
                if(curStudents > student)
                    return false;
            }else{
                curPages += page;

            }
        }
        return true;
    }
    }
