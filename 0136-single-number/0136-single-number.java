class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    p=p+nums[i]*2;
                    continue;
                }
            }

        }
        return (sum-p);
    }
}