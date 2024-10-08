class Solution {
    public int minSwaps(String s) {
        int cnt = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '['){
                cnt++;
            }else{
                if(cnt>0)
                cnt--;
            }
        }
        return (cnt+1)/2;
    }
}