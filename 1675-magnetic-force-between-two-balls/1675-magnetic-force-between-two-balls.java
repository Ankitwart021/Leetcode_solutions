class Solution {
    public static boolean ispossible(int[] nums, int k, long mid){
        int count = 1;
        long last = nums[0];
        for(int val : nums){
            if((val - last) >= mid){
                last = val;
                count++;
            }
        }
        return(count >= k);
    }
    public int maxDistance(int[] nums, int k) {
         Arrays.sort(nums);
        long left = 0, right = nums[nums.length - 1] - nums[0];
        while(left <= right){
            long mid = left + (right - left) / 2;
            if(ispossible(nums, k, mid) == true){
                
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return (int)right;
    }
}