import java.util.*;
public class pro {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< arr.length ; i++){
            sb.append(arr[i]);
        }
        String m = sb.toString();
        int k = Integer.parseInt(m);
        int ans = k + 1;
        String c = String.valueOf(ans);
        int len = Integer.toString(ans).length();
        int[] arrans = new int[len];
        for(int i = 0 ; i<arrans.length; i++){
            arrans[i] = c.charAt(i) - '0';
       }
        System.out.println(arrans);

         for(int i = 0 ; i<arrans.length; i++){
            System.out.println(arrans[i]);
        }
       
    }
   
}
