class Solution {
    public int firstoccurence(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
    public int lastoccurence(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return right;
    }
    public int[] searchRange(int[] nums, int target) {
        int fi = firstoccurence(nums,target);
        int li = lastoccurence(nums,target);
        if(fi > li) return new int[]{-1,-1};
        return new int[]{fi , li};
    }
}