public class MaxSubArray {
    public static void main(String args[]) {
        int a[]={2,-1,-3,4,-1,2,1,-5,4,3};
      System.out.println(maxSubArray(a));
    }
    public static int maxSubArray(int[] nums) {
        int curr_sum=0;
        int new_sum=0;
        int maxsum=Integer.MIN_VALUE;
        int i=0;
        for(i=0;i<nums.length;i++){
            int num=nums[i];
            curr_sum=(new_sum+num)>(num+curr_sum)?(num+new_sum):(num+curr_sum);
            maxsum=(maxsum>curr_sum)?((maxsum>num)?maxsum:num):((curr_sum>num)?curr_sum:num);
            new_sum=num;
        }
        return maxsum;
    }
}