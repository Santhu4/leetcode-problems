class Solution {
    public int distinctPrimeFactors(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();
        for(int product : nums){
        while(product%2==0){
            tree.add(2);
            product/=2;
        }
        for(int i = 3;i*i<=product;i++){
            while(product%i == 0){
                product/=i;
                tree.add(i);
            }
        }
        if(product>1){
            tree.add(product);
        }
        }
        return tree.size();
    }
}