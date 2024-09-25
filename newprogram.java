import java.util.HashMap;
public class newprogram {

    public static Character c(String C, Character target){
        HashMap<Integer, Character> map = new HashMap<>();
         int min = Integer.MAX_VALUE;
        for(int i = 0; i<C.length(); i++){
        
          int m =   C.charAt(i) - target;
          if(m<0){
             m = target - C.charAt(i);
          }
            map.put(m, C.toCharArray()[i]);
            min = Math.min(m,min);
        }
        
         Character s = map.get(min);

        
        return s;
    }
    public static void main(String[] args) {
       String  C = "axlp";
      Character target = 'm';
      Character ans = c(C,target);
      System.out.println(ans);
   
    }
}
