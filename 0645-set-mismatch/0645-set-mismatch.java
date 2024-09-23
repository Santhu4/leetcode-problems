class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int arr[] = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(!hs.contains(nums[i]))
            hs.add(nums[i]);
            else
            arr[0] = nums[i];
        }
        for(int i = 1;i<=nums.length;i++){
            if(!hs.contains(i)){
                arr[1] = i;
            }
        }
        return arr;
    }
}