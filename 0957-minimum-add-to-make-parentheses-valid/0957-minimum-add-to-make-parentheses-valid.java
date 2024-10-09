class Solution {
    public int minAddToMakeValid(String str) {
        int openbrackets = 0;
        int closedbrackets = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '('){
                openbrackets++;
            }else{
                if(openbrackets>0){
                    openbrackets--;
                }else{
                closedbrackets++;
                }
            }
        }
        return openbrackets+closedbrackets;
       }
}