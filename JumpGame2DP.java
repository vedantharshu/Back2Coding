//link: https://leetcode.com/problems/jump-game-ii/
public class JumpGame2DP {
    public static void main(String args[]){
        int a[]={3,3,0,2,1,4};
        System.out.println(jump(a));
    }
    public static int jump(int[] nums) {
        int l=nums.length;
        if(l==1)
            return 0;
        if(l==2)
            return 1;
        int dp[]=new int[l];
        dp[0]=0;
        int i,lf=0;
        int j;
        for(i=0;i<l-1;i++){
            if(i+nums[i]>lf){
                for(j=i+1;j<=i+nums[i]&&j<l;j++){
                    if(dp[j]==0)
                        dp[j]=dp[i]+1;
                    else
                        dp[j]=Math.min(dp[i]+1,dp[j]);
                }
                lf=j-1;
            }
        }
        return dp[l-1];
    }
}
