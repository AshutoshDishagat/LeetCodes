class Solution {
    public boolean search(int[] nums, int target) {
        return searchRecursive(nums, target, 0, nums.length - 1);
    }
    
    private boolean searchRecursive(int[] nums, int target, int si, int ei) {
        
        if (si > ei) {
            return false;
        }
        
        int mid = si + (ei - si) / 2;
        
        
        if (nums[mid] == target) {
            return true;
        }
        
        if (nums[si] == nums[mid] && nums[mid] == nums[ei]) {
            return searchRecursive(nums, target, si + 1, ei - 1);
        }
        
        if (nums[si] <= nums[mid]) {
            
            if (nums[si] <= target && target < nums[mid]) {
                
                return searchRecursive(nums, target, si, mid - 1);
            } else {
                
                return searchRecursive(nums, target, mid + 1, ei);
            }
        } 
        
        else {
            
            if (nums[mid] < target && target <= nums[ei]) {
                
                return searchRecursive(nums, target, mid + 1, ei);
            } else {
                
                return searchRecursive(nums, target, si, mid - 1);
            }
        }
    }
}