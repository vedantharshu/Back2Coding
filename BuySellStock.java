//link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
public class BuySellStock {
    public static void main(String args[]){
        int a[]={7,1,6,5,3};
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] prices) {
        int l =prices.length;
        if(l==1)
            return 0;
        if(l==2)
            return (prices[0]>prices[1]?0: prices[1]-prices[0]);
        int i,buy=prices[0],nBuy =buy, sell=0, profit=0;
        for(i=1;i<l;i++){
            sell=prices[i];
            int t1=sell-buy;
            int t2=sell-nBuy;
            profit=Math.max(profit,Math.max(t1,t2));
            if(t2>t1)
                buy=nBuy;
            nBuy=prices[i];
        }
        return profit;
    }
}
