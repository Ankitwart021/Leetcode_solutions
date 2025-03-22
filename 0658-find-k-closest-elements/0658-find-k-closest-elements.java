class Solution {
    public int findfloor(int[] nums, int target){
          int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return right;
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int floor = findfloor(arr, x);
        int ceil = floor+1;
        for(int i = 0; i < k; i++){
            int floordist = (floor == -1) ? Integer.MAX_VALUE : (x - arr[floor]);
            int ceildist = (ceil == arr.length) ? Integer.MAX_VALUE : (arr[ceil] - x);
            if(floordist <= ceildist){
                floor--;
            }
            else{
                ceil++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int idx = floor+1; idx < ceil; idx++){
            res.add(arr[idx]);
        }

        return res;
    }
}