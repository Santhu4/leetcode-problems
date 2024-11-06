class Solution {
    public int num_Of_Set_Bits(int n){
        int cnt = 0;
        while(n>0){
            cnt += (n&1);
            n >>= 1;
        }
        return cnt;
    }

    public boolean is_Sorted(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public void swap(int i ,int arr[]){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }

    public boolean canSortArray(int[] nums) {
        if(is_Sorted(nums)) return true;
        boolean flag = true;
        while(flag){
        flag = false;
        for(int i = 0;i<nums.length-1;i++){
            if(num_Of_Set_Bits(nums[i]) == num_Of_Set_Bits(nums[i+1]) && nums[i+1]<nums[i]){
                flag = true;
                swap(i,nums);
            }
        }
        if(is_Sorted(nums)) return true;
        }

        return false;
        // for(int i : nums){
        //     System.out.println(i);
        // }
        
    }
}