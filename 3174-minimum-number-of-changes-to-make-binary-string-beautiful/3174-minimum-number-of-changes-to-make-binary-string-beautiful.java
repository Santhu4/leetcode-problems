class Solution {
    public int minChanges(String s) {
        int len = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<s.length()-1;i+=2){
            if(s.charAt(i)!=s.charAt(i+1)){
                len++;
            }
        }
    return len;
    }
}