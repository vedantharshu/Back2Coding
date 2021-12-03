public class FibonacciDP {
    public static void main(String args[]){
        System.out.println(fib(2));
    }
    public static int fib(int n) {
        if(n<2)
            return n;
        int f[]=new int[n+1];
        f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
}
