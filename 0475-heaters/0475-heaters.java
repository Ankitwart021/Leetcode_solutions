class Solution {
    public int findfloor(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
            
        }
        return right;
    }
    public int findclosest(int[] heaters ,int house){
        int floor = findfloor(heaters, house);
        int ceil = floor + 1;
        int floordist = (floor == -1) ? Integer.MAX_VALUE : (house - heaters[floor]);
        int ceildist = (ceil == heaters.length) ? Integer.MAX_VALUE : (heaters[ceil] - house);
         return Math.min(floordist, ceildist);

    }
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int minradius = 0;
        for(int house : houses){
            int radius = findclosest(heaters , house);
            minradius = Math.max(minradius, radius);
        }
        return minradius;
    }
}