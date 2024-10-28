class Solution {
    public String compressedString(String word) {
        StringBuilder str = new StringBuilder("");
        int sum = 1;
        char curr = word.charAt(0);
        char prev = word.charAt(0);
        for(int i = 1;i<word.length();i++){
            prev = curr;
            curr = word.charAt(i);
            if(prev == curr && sum <9){
                sum++;
            }else{
                str.append(String.valueOf(sum)).append(prev);
                sum = 1;
            }
        }
        str.append(String.valueOf(sum)).append(curr);
        return str.toString();
    }
}