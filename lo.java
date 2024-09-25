import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
public class lo {    
    public static void main(String[] args) {
        System.out.println("hello");
        Integer[] arr = {1,2,3,4,5,6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        
    }
}
