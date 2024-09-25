import java.util.*;
public class sortig {
    public static int[] sorting(int[] arr){
      int[]ar = new int[arr.length];
      PriorityQueue<Integer> qu = new PriorityQueue<Integer>() ;
      for( int i= 0 ; i<arr.length; i++){
        qu.add(arr[i]);  
        }
       for(int i = 0 ; i<arr.length; i++){
        ar[i] = qu.remove();
       }

      return ar;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,3,12,3};
        System.out.println(sorting(arr));
        int arrr[] = sorting(arr);
        for(int i = 0 ; i<arrr.length; i++){
            System.out.println(arrr[i]);
        }
    }
}
