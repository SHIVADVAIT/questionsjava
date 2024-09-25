import java.util.*;
import java.util.HashSet;

public class pangram {
    public static boolean pangram(String C){
        HashSet<Character> set =  new HashSet<>();
        for(int a = 'a' ; a<='z'; a++){
            set.add((char)a);
        }
        for(int i = 0 ; i<C.length(); i++){
            if(set.contains(C.charAt(i))){
                set.remove(C.charAt(i));
            }
        }
        if(set.isEmpty())
        {
            return true;
        }

      return  false; }

      public static void main(String[] args) {
        String c = "abcdefghjiklmnopqrstvuwyzx";
        String d = "ab";
        System.out.println(pangram(d));
      }
}
