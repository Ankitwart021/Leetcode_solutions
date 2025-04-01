class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if((long) mid * mid == (long) num){
                return true;
            }
            else if((long) mid * mid <(long) num){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
}