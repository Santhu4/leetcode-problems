class Solution {
    public boolean isCircularSentence(String sentence) {
        String str[] = sentence.split(" ");
        String first = str[0];
        for(int i = 1;i<str.length;i++){
            if(first.charAt(first.length()-1)!=str[i].charAt(0)){
                return false;
            }
            first = str[i];
        }
        if(str[0].charAt(0)!=str[str.length-1].charAt(str[str.length-1].length()-1)){
            return false;
        }
        return true;
    }
}