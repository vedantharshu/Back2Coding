public class NumTrees {
    public static void main(String args[]){
        System.out.println(numTrees(5));
    }
    public static int numTrees(int n) {
        if(n==1)
            return 1;
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        int i,x=0,j;
        for(i=3;i<=n;i++){
            for(j=1;j<=i;j++){
                x+=dp[j-1]*dp[i-j];
            }
            dp[i]=x;
            x=0;
        }
        return dp[n];
    }
}