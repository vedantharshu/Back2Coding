import java.util.*;
public class LargestCycle {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int i,n;
      int a[];
      for(i=0;i<t;i++){
          n=sc.nextInt();
          a=new int[n];
          for(int j=0;j<n;j++)
            a[j]=sc.nextInt();
            int ans = largestCycle(a);
        System.out.println(ans);
      }
    }
    public static boolean hasEle(int a, int[] n){
        for(int x: n){
            if(x==a)
                return true;
        }
        return false;
    }
    public static int largestCycle(int a[]){
        int i,c=0,max=Integer.MIN_VALUE,sum=0,msum=Integer.MIN_VALUE;
        for(i=0;i<a.length;i++){
            if(hasEle(i,a)){
                int st=i;int end=-1;
                int j=i;
                boolean b[]=new boolean [a.length];
                while(true){
                    if(b[j]==true||a[j]==-1){
                        end=j;
                        break;
                    }
                    if(b[j]==false){
                        b[j]=true;
                        ++c;
                        sum=sum+j;
                    }
                    j=a[j];
                }
                if(st==end){
                    if(max<c){
                        max=c;
                    }
                    if(msum<sum){
                        msum=sum;
                    }
                }
                c=0;sum=0;
            }
        }
        return msum;
    }
}