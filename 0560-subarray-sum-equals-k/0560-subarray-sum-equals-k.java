class Solution {
    public int subarraySum(int[] nums, int k) {
     int nos = 0;
     Map<Integer,Integer> map = new HashMap<>();
     map.put(0, 1);
     int sum = 0;
     for( int i = 0; i< nums.length; i++){
        sum += nums[i];
        int diff = sum -k;
        if(map.containsKey(diff))
        nos += map.get(diff);
        if(map.containsKey(sum))
        map.put(sum,map.get(sum) + 1);
        else
         map.put(sum, 1);
     } 
     return nos;
    }
}