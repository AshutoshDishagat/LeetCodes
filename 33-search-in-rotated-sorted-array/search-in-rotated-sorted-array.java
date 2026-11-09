class Solution {
    public int search(int[] nums, int target) {
        return search2(nums ,target, 0 , nums.length-1);

    }

    private int search2(int nums[], int target, int si, int ei ){

        if(si > ei){
            return -1;
        }
        int mid = si+(ei-si)/2;

        if(nums[mid] == target){
            return mid;
        }
        if(nums[si] <= nums[mid]){
            if(nums[si] <= target && nums[mid] > target){
                return search2(nums, target, si,mid);
            }
            else{
                return search2(nums, target, mid+1, ei);
            }
        }
        else{
            if(nums[mid] < target && target <= nums[ei]){
                return search2(nums,target,mid+1, ei);
            }
            else{
                return search2(nums, target , si, mid-1);
            }
        }
    }
}