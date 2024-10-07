class Solution {
    public int minLength(String s) {
        StringBuilder o = new StringBuilder(s);
        StringBuilder ab_str =  new StringBuilder(s);
        StringBuilder cd_str =  new StringBuilder(s);
        while(cd_str.toString().contains("AB") || cd_str.toString().contains("CD")){
            o = cd_str;
        ab_str =new StringBuilder(o.toString().replace("AB",""));
        cd_str =new StringBuilder(ab_str.toString().replace("CD",""));
        }
        return cd_str.length();
    }
}