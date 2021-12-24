//link: https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public static void main(String args[]){
        System.out.println(reverse(-2147483412));
    }
    public static int reverse(int x) {
        int l =(int)Math.log10(x);
        boolean flag=false;
        int m=Integer.MAX_VALUE;
        if(x<0){
            m=Integer.MIN_VALUE;
            if((x/1000000000)<0){
                flag=true;
                l=9;
            }
        }
        //length == 9 is for case of max integer, and flag value is for case of minimum integer
        if(l==9||flag){
            int n=x;
            for(int i=0;i<=l;i++){
                int r1=m/(int)Math.pow(10,l-i);
                m=m%(int)Math.pow(10,l-i);
                int r2=n%10;
                System.out.println("r1= "+r1+" r2= "+r2);
                n=n/10;
                if(Math.abs(r2)>Math.abs(r1))
                    return 0;
                if(Math.abs(r2)<Math.abs(r1))
                    break;
            }   
        }
        return rev(x);
    }
    public static int rev(int n){
        int rev=0;
        while(n!=0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
}
