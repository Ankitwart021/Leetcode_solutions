class Solution {
    public int  binarysearch(int[] nums, int target, int left, int right){
         
        
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid] > target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            
        }
        return -1;
    }
    public int search(int[] nums, int target) {
       int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(nums[mid] >= nums[0]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        if(left > nums.length - 1){
            int a = binarysearch(nums, target, 0, nums.length - 1);
            return a;
        }
        else if(target < nums[0]){
            int b = binarysearch(nums, target, left, nums.length - 1);
            return b;
        }
        else{
            int c = binarysearch(nums, target, 0, right);
            return c;
        }
        
        
    }
}