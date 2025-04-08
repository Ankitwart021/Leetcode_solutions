class Solution {
    public boolean ispossible(int[] nums, int k, long mid){
        long currload = 0;
        int count = 1;
        for(int val : nums){
            if(currload + val <= mid){
                currload += val; 
            }
            else{
                currload = val;
                count++;
            }
        }
        return (count <= k);
    }
    public int splitArray(int[] nums, int k) {
        long left = 0, right = 0;
        for(int val : nums){
            right += val;
            left = Math.max(left, val);
        }
        while(left <= right){
            long mid = left + (right - left) / 2;
            if(ispossible(nums, k, mid) == true){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return (int)left;
    }
}