class Solution {
    public boolean isDivisible(int n,int d){
        int num = 0;
        int jam = 1;
        while(n!=0){
            num = n%10;
            jam*=num;
            n/=10;
        }
        return jam % d == 0;
    }
    public int smallestNumber(int n, int t) {
        while(!(isDivisible(n,t))){
            n++;
        }
        return n;
    }
}