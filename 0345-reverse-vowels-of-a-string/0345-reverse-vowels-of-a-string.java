class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        if(s.length() == 0){
            return "";
        }
        char  arr[] = s.toCharArray();
        int l = 0,r = arr.length-1;
        while(l<r){
                if(isVowel(arr[l]) && isVowel(arr[r])){
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }else if(isVowel(arr[l]) && !(isVowel(arr[r]))){
                    r--;
                }else if(!(isVowel(arr[l])) && isVowel(arr[r])){
                    l++;
                }else{
                    l++;
                    r--;
                }
        }
        StringBuilder str = new StringBuilder("");
        for(char i : arr){
            str.append(i);
        }
        return str.toString();
    }
}