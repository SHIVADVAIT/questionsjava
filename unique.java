import java.util.*;
public class unique {
    public static Stack<Integer> unique( int arr[]){
    int x = 0 ;
    int j = 0;
    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i<arr.length; i++ ){
         if(stack.contains(arr[i])){
            continue;
         }
         stack.add(arr[i]);
         j++;
    }
    
    return stack;

    }
    public static void main(String[] args) {
        int[] arrr = {1,2,3,4,2,1,3};
        Stack<Integer> staack =  unique(arrr);
        System.out.println(staack);
        int size = staack.size();
        for(int i = 0 ; i<size; i++){
          int j =  staack.pop();
          System.out.println(j);
        }
        
    }
}
