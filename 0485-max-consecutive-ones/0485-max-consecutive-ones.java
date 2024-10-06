class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int prev = Integer.MIN_VALUE;
        for(int i : nums){
            if(i==1){
                cnt++;
            }else{
            prev = Math.max(prev,cnt);
            cnt = 0;
            }
        }
        prev = Math.max(prev,cnt);
        return prev;
    }
}