import java.util.*;
public class ValidParenthesis {
    public static void main(String args[]){
        System.out.println(isValid("()())(())"));
    }
    public static boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        int l=s.length();
        if(l%2!=0)
            return false;
        int i;
        for(i=0;i<l;i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                if(c==')'||c=='}'||c==']')
                    return false;
                st.push(c);
                continue;
            }
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            else if(c==')'||c=='}'||c==']'){
                char d=st.peek();
                if((d=='('&&c==')')||(d=='{'&&c=='}')||(d=='['&&c==']'))
                    st.pop();
                else
                    return false;
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }
}