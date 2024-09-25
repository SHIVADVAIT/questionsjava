import java.util.*;
public class substrings {
    public static boolean substr(String C, String sussb){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i< C.length(); i++){
            map.put(C.toCharArray()[i], map.getOrDefault(C.toCharArray()[i], 0)+ 1);
        }

        for(int i = 0  ; i<sussb.length(); i++){
            if(!map.containsKey(sussb.toCharArray()[i]) ){
             return false;
            }
            map.put(sussb.toCharArray()[i], map.getOrDefault(sussb.toCharArray()[i], 0) -1);
            if(map.get(sussb.toCharArray()[i])== -1){
                return false;
            }
        }
      return true;
    }

    public static void main(String[] args) {
        String c = "abcdef";
        String d = "abce";
        ArrayList<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(8);
        System.out.println(s.toArray()[1]);
        System.out.println(substr(c, d));
    }
}
