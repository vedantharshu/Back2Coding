public class HouseRobber2DP {
    public static void main(String args[]){
        int a[]={1,2,3,1};
        System.out.println(rob(a));
    }
    public static int rob(int[] nums) {
        int l=nums.length;
        if(l==1)
            return nums[0];
        if(l==2)
            return Math.max(nums[0],nums[1]);
        int dp[]=new int[l-1];
        //using hourse robber 1 solution: for nums array from index 0 to n-2
        
        dp[0]=nums[0];
        dp[1]=nums[1];
        int i,max=Math.max(dp[0],dp[1]);
        if(l==3){
            return Math.max(nums[2],max);
        }
        dp[2]=nums[2]+dp[0];
        
        max=Math.max(dp[2],dp[1]);
        for(i=3;i<l-1;i++){
            dp[i]=Math.max(dp[i-2],dp[i-3])+nums[i];
            max=Math.max(dp[i],max);
        }
        
        //using hourse robber 1 solution: for nums array from index 1 to n-1
        int max1;
        dp[0]=nums[1];
        dp[1]=nums[2];
        max1=Math.max(dp[0],dp[1]);
        dp[2]=nums[3]+dp[0];
        max1=Math.max(dp[2],dp[1]);
        for(i=4;i<l;i++){
            dp[i-1]=Math.max(dp[i-3],dp[i-4])+nums[i];
            max1=Math.max(dp[i-1],max1);
        }
        
        //choosing the best out of both max and max1.
        return Math.max(max1,max);
    }
}
