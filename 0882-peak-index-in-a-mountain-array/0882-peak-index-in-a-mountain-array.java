class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid + 1]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }

        }
        if(left > nums.length - 1) return nums.length - 1;
        return left;
    }
}