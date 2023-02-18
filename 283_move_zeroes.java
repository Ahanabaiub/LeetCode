class Solution {
    public void moveZeroes(int[] nums) {

        int len = nums.length;

        int zero_count = 0;
        int pos = 0;

        for(int i=0; i<len; i++){
            if(nums[i]==0){
                zero_count++;
            }
            else{
                nums[pos]=nums[i];
                pos++;
            }
        }

        while(zero_count>0){
            nums[len-1]=0;
            len--;
            zero_count--;
        }

        System.out.println(nums);

    }
}
