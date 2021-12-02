//link: https://leetcode.com/problems/longest-palindromic-substring/
public class LongestPalindromicSubstring {
    public static void main(String args[]){
        System.out.println(longestPalindrome("aaaa"));
    }
    public static String longestPalindrome(String s) {
        String mWord="";
        int j,i,mlen=0, len=0;
        int l=s.length();
        //for odd length palindrome
        for(i=0;i<l;i++){
            for(j=0;i-j>=0&&i+j<l;j++){
                if(s.charAt(i-j)!=s.charAt(i+j)){
                    break;
                }
                len=2*j+1;
                if(len>mlen){
                    mlen=len;
                    mWord=s.substring(i-j, i+j+1);
                }
            }
        }
        //for even length palindrome
        for(i=1;i<=s.length()-1;i++){
            for(j=1;i-j>=0&&i+j-1<l;j++){
                if(s.charAt(i-j)!=s.charAt(i+j-1)){
                    break;
                }
                len=2*j;
                if(len>mlen){
                    mlen=len;
                    mWord=s.substring(i-j,i+j);
                }
            }
        }
        return mWord;
    }
}
