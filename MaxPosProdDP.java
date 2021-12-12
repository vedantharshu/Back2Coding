public class MaxPosProdDP {
    public static void main(String args[]) {
      int a[]={5,-20,-20,-39,-5,0,0,0,36,-32,0,-7,-10,-7,21,20,-12,-34,26,2};
      System.out.println(getMaxLen(a));
    }
    public static int getMaxLen(int[] nums) {
        boolean neg=false;
        int jump=0;
        int max=0;
        int c=0,prev=1;
        int i;
        int l=nums.length;
        for(i=0;i<l;i++){
            if(prev*nums[i]>0){
                if(!neg){
                    ++c;
                }
                else{
                    c=c+jump+1;
                    neg=false;
                    jump=0;
                }
                prev=1;
                max=Math.max(c, max);
            }
            else if(prev*nums[i]<0){
                    neg=true;
                    prev=-1;
                    ++jump;
            }
            else{
                jump=0;
                neg=false;
                c=0;
                prev=1;
            }
        }
        max=Math.max(max, jump-1);
        int max1=0;
        c=0;prev=1;jump=0;
        for(i=l-1;i>=0;i--){
            if(prev*nums[i]>0){
                if(!neg){
                    ++c;
                }
                else{
                    c=c+jump+1;
                    neg=false;
                    jump=0;
                }
                prev=1;
                max1=Math.max(c, max1);
            }
            else if(prev*nums[i]<0){
                    neg=true;
                    prev=-1;
                    ++jump;
            }
            else{
                jump=0;
                neg=false;
                c=0;
                prev=1;
            }
        }
        max1=Math.max(max1,jump-1);
        return Math.max(max,max1);
    }
}