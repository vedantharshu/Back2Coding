public class ClimbingStairsDP {
    public static void main(String args[]){
        System.out.println(climbStairs(8));
    }
    public static int climbStairs(int n) {
        if(n<=2)
            return n;
        int f[]=new int[n];
        f[0]=1;//f(1) has 1 sol, f(1)~f[0].... f(2) has 2 solution, either 1,1 or 2.
        f[1]=2;
        for(int i=2;i<n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n-1];
    }
}
