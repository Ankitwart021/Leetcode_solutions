class Solution {
    public boolean ispossible(int[] nums, int days, int mid){
        int load = 0;
        int count = 1;
        for(int val : nums){
            if(load + val <= mid){
                load += val;
            }
            else{
                count++;
                load = val;
            }
        }
        return(count<=days);
    }
    public int shipWithinDays(int[] nums, int days) {
        int left = 0, right = 0;
        for(int val : nums){
            right += val;
            left = Math.max(left, val);
        
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(ispossible(nums, days, mid) == true){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}