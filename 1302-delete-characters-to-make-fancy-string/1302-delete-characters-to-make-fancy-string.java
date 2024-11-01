class Solution {
    public String makeFancyString(String s) {
        char c,cpo = 65 ,cpt = 65;
        if(s.length()<=2 || s == null){
            return s;
        }
        StringBuilder st = new StringBuilder("");
        for(int i = 0;i<s.length()-2;i++){
             c = s.charAt(i);
             cpo = s.charAt(i+1);
             cpt = s.charAt(i+2);
            if(c != cpo){
                st.append(c);
            }else if(cpo != cpt){
                 st.append(c);
            }
        }
        st.append(cpo).append(cpt);
       return st.toString();
    }
}