class Solution {
    public int reverse(int x) {
        long rev = 0;
        boolean isneg = false;
        if(x<0){
            isneg = true;
            x = (int)Math.abs(x);
        }
        while(x>0){
            int rem = x%10;
            x/=10;
            rev = rev*10l+rem;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            System.out.println(rev);
            return 0;
        }else{
            if(isneg){
                return (int) -rev;
            }
            return (int) rev;
        }
    }
}