import java.util.Stack;

public class reverse {
    public static int  reverse(int c){
     Stack<Character> stack = new Stack<>();
    int ret;
      String s = String.valueOf(c);
      int len = s.length();
      String ss = "";
      for(int i = 0; i<len; i++){
        stack.push(s.charAt(i));
      }
      
      for(int i= 0; i<len; i++){
         Character r = stack.pop();
         ss = ss + r;
      }
        ret = Integer.parseInt(ss);
        return ret;
    }

    public static String revString(String c){
        Stack<Character> stack = new Stack<>();
        String SS = "";
        for(int i = 0; i<c.length(); i++){
            stack.push(c.charAt(i));
        }
        for(int i = 0; i<c.length(); i++){
            SS = SS + stack.pop();
        }
        return SS;

    }

    public  static String recrevstring(String S){
        if(S.length()<=1){
            return S ;
        }
        return (S.substring(1)) + S.charAt(0);
    }
    public static void main(String[] args) {
      System.out.println("Hello");  
      int re = reverse(1234);
      System.out.println(recrevstring("shivansh"));
      System.out.println(re);
      
    }
}