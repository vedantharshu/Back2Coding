public class DeleteAndEarnDP {
    public static void main(String args[]){
        int a[]={2,2,3,3,3,4};
        System.out.println(deleteAndEarn(a));
    }
    public static int deleteAndEarn(int[] nums) {
        int l=nums.length;
        if(l==1)
            return nums[0];
        int dp[]=new int[20000];
        int freq[]=new int[20000];
        for(int x: nums){
            freq[x]++;
        }
        dp[1]=1*freq[1];
        dp[2]=Math.max(2*freq[2],dp[1]);
        int i;
        for(i=3;i<20000;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+i*freq[i]);
        }
        return dp[i-1];
    }
}
