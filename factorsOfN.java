public class factorsOfN {
    public static void main(String args[]){
        giveFactorsOf(342);
    }
    public static void giveFactorsOf(int n){
        int i=0;
        int count=0;
        for(i=1;i<(int)Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i);
                    ++count;
                }
                else{
                    System.out.println(i+"\n"+n/i);
                    count+=2;
                }
            }
        }
        System.out.println("TOTAL FACTORS: "+count);
    }
}
