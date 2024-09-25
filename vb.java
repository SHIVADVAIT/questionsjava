import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class vb {
    public static int[] lowandhigh(int[] arr) {
        int n = arr.length;
        int[] distances = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            distances[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                distances[index] = i - index; 
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            distances[index] = 0; 
        }

        return distances;
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        
        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }
        
        return result;
    }
        public static void main(String[] args) {
        int[] arr = {3, 4, 1, 0, 5};
        int[] arr1 = {3,4,1,8,1};
        int[] inte = intersection(arr,arr1);
        for(int  i = 0 ; i<inte.length; i++)
        System.out.println(inte[i]);
}}
 