import java.util.*;

class Solution {
    static ArrayList<Integer> primes = new ArrayList<>();
    
    public void seive() {
        boolean[] arr = new boolean[1000 + 1];
        Arrays.fill(arr, false);
        
        for (int i = 2; i * i <= arr.length; i++) {
            if (!arr[i]) {
                for (int j = i * i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }
        
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                primes.add(i);
            }
        }
    }

    public int getPrime(int[] p, int n, int j) {
        int k = -1, a = -1;
        if(n <= 2){
            return 0;
        }
        // Find the largest prime less than or equal to `n`
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i) >= n || i == primes.size()-1) {
                if( i == primes.size()-1){
                    k = primes.get(i);
                    a = i;
                }else{
                k = primes.get(i - 1);
                a = i - 1;
                }
                break;
            }
        }

        for (int i = a; i >= 0; i--) {
            if (j > 0) {
                if ((n - primes.get(i)) > p[j - 1] && primes.get(i) < n) {
                    return primes.get(i);
                }
            } else {
                return k;
            }
        }
        return -1;
    }

    public boolean primeSubOperation(int[] nums) {
        int[] p = new int[nums.length];
        
        if (primes.isEmpty()) {
            seive();
        }

        for (int i = 0; i < nums.length; i++) {
            int z = getPrime(p, nums[i], i);
            //System.out.println(z);
            p[i] =  z <= 0 ? nums[i] : nums[i] - z;
            //p[i] = z == 0 ? nums[i] : nums[i] - z;
            nums[i] = p[i];
        }
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            //System.out.println(nums[i]);
            if (nums[i] >= nums[i + 1]) {
                flag =  false;
            }
        }
        //System.out.println(nums[nums.length-1]);
        return flag;
    }
}
