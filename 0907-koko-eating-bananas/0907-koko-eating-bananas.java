class Solution {
    public boolean ans(int[] piles, int h, int n){
        long sum = 0;
        for(int i = 0; i < piles.length; i++){
            sum += (piles[i] + n - 1) / n;
        }
        if(sum <= h) return true;
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
         int left = 1, right = Integer.MIN_VALUE;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(ans(piles, h, mid) == true){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left; 
    }
}