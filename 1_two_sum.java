class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap();
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            int temp = target - nums[i];

            if(map.get(temp) == null){
                map.put(nums[i],i);
            }
            else{
                ans[0] = i;
                ans[1] = map.get(temp);
                break;
            }
        }
        return ans;

    }
}
