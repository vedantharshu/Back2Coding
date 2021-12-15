public class TrappingRainWater {
    public static void main(String args[]){
        int a[]={};
        System.out.println(trap(a));
    }
    public static int trap(int[] height) {
        int l=height.length;
        if(l<=2)
            return 0;
        int j;
        for(j=0;j<l;j++){
            if(height[j]>0)
                break;
        }
        int i,ans=0;
        int max=height[j];
        for(i=j+1;i<l;i++){
            if(height[i]>height[i-1]){
                ans+=check(height,Math.min(max,height[i]),i-1);
                max=Math.max(max,height[i]);
            }
        }
        return ans;
    }
    public static int check(int []a,int max, int index){
        int ans=0;
        while(a[index]<max){
            ans+=max-a[index];
            a[index]=max;
            --index;
        }
        return ans;
    }
}
