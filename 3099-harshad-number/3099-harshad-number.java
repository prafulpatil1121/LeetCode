class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp = x;
        int sum =  0;
        while( x != 0){
            int digit = x % 10;
            sum += digit;
            x = x / 10;
        }
        if(sum != 0 && temp % sum == 0){
            return sum;
        }else {
            return -1;
        }
    }
}