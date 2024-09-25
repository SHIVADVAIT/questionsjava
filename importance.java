import java.util.*;
public class importance {
    public static int[] duplicates(int[] arr){
      int[] dup = {};
      
      HashMap<Integer,Integer> map = new HashMap<>();
      HashSet<Integer> ar = new HashSet<>();

      for(int i = 0 ; i< arr.length ; i++){
        int j = 0; 
        if(!map.containsKey(arr[i])){
            
             map.put(arr[i], j);
        }
        else{
            j++;
            map.put(arr[i],j );
            ar.add(arr[i]);
        }
      }
      int newarr[] = new int[ar.size()];
      int i = 0;
       for(int el : ar){
    
             newarr[i] = el;
             i++;
       }
      
      return newarr;
    }

    public static void main(String[] args) {
        int[] appr = {12,3,5,6,7,8,8,8,8,3,1,4};
      int [] asd =  duplicates(appr);
      for(int i = 0 ; i<asd.length; i++)
      System.out.println(asd[i]);
    }
}
