//link: https://leetcode.com/problems/min-cost-climbing-stairs/
public class MinCostClimbingStairsDP {
    public static void main(String args[]){
        int a[]={1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(a));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int fr=cost[0];
        int sc=cost[1];
        int l=cost.length;
        if(l==2){
            return Math.min(fr,sc);
        }
        for(int i=2;i<l;i++){
            int s=Math.min(fr,sc)+cost[i];
            fr=sc;
            sc=s;
        }
        return Math.min(fr,sc);
    }
}
