class Solution {
    public int mySqrt(int x) {
        int left = 1, right = x;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if((long) mid * mid == (long) x){
                return mid;
            }
            else if((long)mid * mid < (long) x){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return right;
    }
}