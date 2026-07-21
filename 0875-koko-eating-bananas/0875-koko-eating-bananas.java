class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for( int p : piles){
            max = Math.max(max, p);
        }
        int start = 1;
        int end = max;
        while(start <= end){
            int mid = start+(end - start)/ 2;
            if (isvalid(piles,h,mid)){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return start;
    }
    private static boolean isvalid(int[] piles, int h, int k) {
       int hours = 0;
       for ( int p : piles){
        hours += (p + k - 1) / k;
        if ( hours > h) return false;
       }
        return true;
    }
        
    
}