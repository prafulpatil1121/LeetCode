 import java.util.*;
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int sum = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                sum += key;
            }
        }

        return sum;
    }
    }