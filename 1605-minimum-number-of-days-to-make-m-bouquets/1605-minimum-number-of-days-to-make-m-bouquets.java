class Solution {
    public boolean ispossible(int[] nums, int m, int k, int mid){
    int bouquets = 0;
    int flowers = 0;

    for(int val : nums){
        if(val <= mid){
            flowers++; // flower has bloomed by `mid` day
            if(flowers == k){
                bouquets++;
                flowers = 0; // reset because bouquet formed
            }
        } else {
            flowers = 0; // broken sequence
        }
    }

    return bouquets >= m;
}

    public int minDays(int[] nums, int m, int k) {
        if((long)m*k > nums.length) return -1;
        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for(int val : nums){
            left = Math.min(left, val);
            right = Math.max(right, val);
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(ispossible(nums,m,k,mid) == true){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}