class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int a: nums) set.add(a);
        int longest = 0;
        for(int a: set){
            int current = 1;
            if(set.contains(a -1)){
                continue;
            }
            if(set.contains( a+1)){
                while ( set.contains(++a))
                current++;
            }
            longest = Math.max(longest,current);
        }
        return longest;
    }
}