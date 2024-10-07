class Solution {
    public int minLength(String str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(s.isEmpty()){
                s.push(ch);
                continue;
            }
            if(s.peek() == 'A' && ch == 'B'){
                s.pop();
            }else if(s.peek() == 'C' && ch == 'D'){
                s.pop();
            }else{
                s.push(ch);
            }
        }
        
        return s.size();
    }
}