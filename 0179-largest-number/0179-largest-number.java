class Solution {
    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length];
        for(int i = 0;i<arr.length;i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b) -> {
            String str1 = a+b;
            String str2 = b+a;
            return str2.compareTo(str1);
        });
        if(arr[0].equals("0")){
            return "0";
        }
        StringBuilder str = new StringBuilder("");
        for(String i : arr){
            str.append(i);
        }
        return str.toString();
    }
}