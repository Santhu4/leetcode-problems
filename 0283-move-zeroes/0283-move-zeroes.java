class Solution {
    public void moveZeroes(int[] nums) {
        int r = 0,l = 0;
        while(r<nums.length){
            if((nums[r]>0 || nums[r]<0)){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
                r++;
        }
    }
}