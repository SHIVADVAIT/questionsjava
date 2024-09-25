import java.util.*;
public class para
 {
    public static String parallel(String C){
        String reduced = "";
        Stack<Character> stack = new Stack<>();
        for(int i= 0 ; i<C.length(); i++){
            
           if(!stack.isEmpty()){
            if(stack.peek()==C.charAt(i)){
                stack.pop();
                continue;
            }}
            
            stack.push(C.charAt(i));
        }
      
        while(!stack.isEmpty()){
           char c = stack.pop();
           reduced = c + reduced;
        }
        int n = reduced.length();
        for(int i = 0 ; i<n/2; i++){
        char temp = reduced.toCharArray()[i];
         reduced.toCharArray()[i] = reduced.toCharArray()[n- 1];
         reduced.toCharArray()[n-1] = temp;
        }
        return reduced;
    }

    public static void main(String[] args) {
        String c = "abxxyzzzcs";
        System.out.println(parallel(c));
    }

}
