//link: https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public static void main(String args[]){
        int ar[]={1,3,4,2,5,6,2,9};
        System.out.println(maxArea(ar));
    }
    public static int maxArea(int[] height) {
        int st=0, en=height.length-1;
           int area=0;
           while(st<en){
               area=Math.max(area, Math.min(height[st],height[en])*(en-st));
               if(height[st]>height[en]){
                   en--;
               }else
                   st++;
           }
           return area;
       }
}
