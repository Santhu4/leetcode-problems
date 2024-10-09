class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if(arr.length == 1){
            if(arr[0] == 1 && n>0){
                return false;
            }else if(arr[0] == 0 && n==1){
                return true;
            }else 
            return true;
        }
        if(arr[0] == 0 && arr[1] == 0){
            arr[0] = 1;
            n--;
        }
        for(int i = 1;i<arr.length-1;i++){
            if((arr[i]==arr[i-1] && arr[i]==arr[i+1]) && (arr[i] == 0 && arr[i-1] == 0 && arr[i+1] == 0)){
                arr[i] = 1;
                n--;
            }
        }
        if(n>0){
            if(arr[arr.length-2] == 0 && arr[arr.length-1] == 0){
                arr[arr.length-1] = 1;
                n--;
            }
        }
        return n<=0;
    }
}