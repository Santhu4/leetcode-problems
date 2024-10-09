class Solution {
    public boolean is(int arr[],int key){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max <= key;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max;
        int[] cpyarr = Arrays.copyOf(candies,candies.length);
        ArrayList<Boolean> arr = new ArrayList<>();
        for(int i = 0;i<candies.length;i++){
            max = Integer.MIN_VALUE;
            candies[i]+=extraCandies;
            arr.add(is(cpyarr,candies[i]));
        }
        return arr;
    }
}