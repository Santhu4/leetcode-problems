class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> s = new Stack<>();

        for(int i = 0;i<nums.length;i++){
            if(s.isEmpty() || nums[i]<nums[s.peek()]){
                s.push(i);
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i = nums.length-1;i>=0;i--){
           while(!s.isEmpty() && nums[s.peek()]<=nums[i]){
            max = Math.max(max,i-s.pop());
           }
           if(s.isEmpty()){
            break;
           }
        }
         //System.out.println(s);
        return max;
    }
}