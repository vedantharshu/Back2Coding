//link: https://leetcode.com/problems/jump-game/
public class JumpGameDP {
    public static void main(String args[]){
        int a[]={2,3,1,1,4};
        System.out.println(canJump(a));
    }
    public static boolean canJump(int[] nums) {
        int l=nums.length;
           if(l==1)
               return true;
           if(nums[0]==0)
               return false;
           int i;
           int jump=nums[0];
           for(i=0;i<l-1;i++){
               if(jump==0&&nums[i]==0)
                   return false;
               if(jump<nums[i]){
                   jump=nums[i];
               }
               --jump;  
           }
           return true;
       }
}
