class Solution {
    public int longestCommonPrefix(int[] ar1, int[] ar2) {
        int Max = 0;
        String arr1[] = new String[ar1.length];
        String arr2[] = new String[ar2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = String.valueOf(ar1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = String.valueOf(ar2[i]);
        }

        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k <= arr2[i].length(); k++) {
                hs.add(arr2[i].substring(0, k));
            }
        }
        HashSet<String> hs2 = new HashSet<>();

        for (int j = 0; j < arr1.length; j++) {
            for (int k = 0; k <= arr1[j].length(); k++) {
                hs2.add(arr1[j].substring(0, k));
            }
        }

    for(String str : hs2){
        if(hs.contains(str)){
                Max = Math.max(str.length(), Max);
        }
    }
        return Max;
    }
}