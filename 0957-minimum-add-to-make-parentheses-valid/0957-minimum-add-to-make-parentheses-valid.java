class Solution {
    public int minAddToMakeValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i  =  0;i<str.length();i++){
            char ch = str.charAt(i);
            if(s.isEmpty()){
                s.push(ch);
                continue;
            }else if(s.peek() == '(' && ch == ')'){
                s.pop();
            }else{
                s.push(ch);
            }
        }
        return s.size();
       }
}