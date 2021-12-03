public class TribonacciDP {
    public static void main(String args[]){
        System.out.println(tribonacci(7));
    }
    public static int tribonacci(int n) {
        if(n<2)
            return n;
        if(n==2)
            return 1;
        int f[]=new int[n+1];
        f[1]=1;
        f[2]=1;
        for(int i=3;i<=n;i++){
            f[i]=f[i-1]+f[i-2]+f[i-3];
        }
        return f[n];
    }
}
