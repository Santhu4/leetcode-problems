class Solution {
    public int largestCombination(int[] candidates) {
     int bits[] = new int[32];
     for(int i = 0;i<32;i++){
        for(int num : candidates){
            if((num & (1<<i)) !=0){
                bits[i]++;
            }
        }
     }
     int max = Integer.MIN_VALUE;
     for(int i = 0;i<32;i++){
        max = Math.max(bits[i],max);
     }
     return max;
    }
}