public class HouseRobberDP {
    public static void main(String args[]){
        int a[]={1,5,3,2,5};
        System.out.println(rob(a));
    }
    public static int rob(int[] nums) {
        int l = nums.length;
        if(l==1)
            return nums[0];
        if(l==2)
            return Math.max(nums[0],nums[1]);
        int i;
        int dp[]=new int [l];
        dp[0]=nums[0];
        dp[1]=nums[1];
        dp[2]=nums[2]+dp[0];
        int max=Math.max(dp[2],dp[1]);
        for(i=3;i<l;i++){
            dp[i]=Math.max(dp[i-2],dp[i-3])+nums[i];
            max=Math.max(dp[i],max);
        }
        return max;
    }
}
