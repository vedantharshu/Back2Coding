import java.util.*;
public class TwoSum {
    public static void main(String args[]){
        int a[]={3,2,4};
        int t=6;
        System.out.println(twoSum(a,t));
    }
    public static int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        int i, l=nums.length;
        List<Integer> a=new LinkedList<>();
        for(i=0;i<l;i++)
            a.add(nums[i]);
        for(i=0;i<l;i++){
            int t=target-a.get(i);
            if(a.contains(t)){
                ans[0]=i;
                int index= a.indexOf(t);
                ans[1]=index;
                if(index!=i)
                break;
            }
        }
        return ans;
    }
}
