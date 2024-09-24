class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr= new ArrayList<>();
   List<Integer> f = new ArrayList<>();
   f.add(1);
   arr.add(f);
   for(int i = 1;i<numRows;i++){
    List<Integer> a = new ArrayList<>();
    a.add(1);
    for(int j = 1;j<i;j++){
        a.add(arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
    }
    a.add(1);
    arr.add(a);
   }
   return arr;
    }
}