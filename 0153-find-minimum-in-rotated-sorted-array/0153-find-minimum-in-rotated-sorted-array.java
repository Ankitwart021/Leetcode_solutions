class Solution {
    public int findMin(int[] nums) {
       int left = 0, right = nums.length - 1;;
       while(left <= right){
        int mid = left + (right - left) / 2;
        if(nums[mid] < nums[0]){
            right = mid - 1;
        }
        else{
            left = mid+1;
        }
       }
       if(left > nums.length - 1) return nums[0];
       return nums[left]; 
    }
}