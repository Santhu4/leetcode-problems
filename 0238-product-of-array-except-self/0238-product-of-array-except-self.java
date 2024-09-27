class Solution {
    public int[] productExceptSelf(int[] nums) {
     int prefix[]    = new int[nums.length];
     prefix[0] = 1;
     for(int i = 1;i<prefix.length;i++){
        prefix[i] = prefix[i-1]*nums[i-1];
     }
     int suffix[] = new int[nums.length];
     suffix[suffix.length-1] = 1;
     for(int i = suffix.length-2;i>=0;i--){
        suffix[i] = suffix[i+1] * nums[i+1];
     }
     int result[] = new int[nums.length];
     for(int i = 0;i<result.length;i++){
        result[i] = prefix[i]*suffix[i];
     }
     return result;
    }
}