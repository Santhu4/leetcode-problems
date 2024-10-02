import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> hm  = new HashMap<>();
        int sarr[] = Arrays.copyOf(arr,arr.length);
        Arrays.sort(sarr);
        int rank = 1;
        for(int i : sarr){
            if(!hm.containsKey(i)){
                hm.put(i,rank++);
            }
        }
        for(int i = 0;i<arr.length;i++){
            sarr[i] = hm.get(arr[i]);
        }
        return sarr;
    }
}
