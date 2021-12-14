//link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
import java.util.*;
public class LongSubstrWithoutRep {
    public static void main(String args[]){
        System.out.println(lengthOfLongestSubstring("bbbbba"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int l=s.length();
        if(l<=1)
            return l;
        HashMap<Character,Integer> map=new HashMap<>();
        int win=1,max=1;
        map.put(s.charAt(0),0);
        int i;
        for(i=1;i<l;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int index=map.get(ch);
                int t=i-index;
                if(t<=win)
                    win=t;
                else
                    ++win;
                max=Math.max(max,win);
                map.put(ch,i);
                continue;
            }
            map.put(ch,i);
            win=win+1;
            max=Math.max(max,win);
        }
        return max;
    }
}

