import java.util.ArrayList;
import java.util.List;

public class backtracking {
    public  static List<List<Character>> subsets(String C) {
        List<List<Character>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), C.toCharArray());
        return resultList;
    }

    public static void backtrack(List<List<Character>> resultList, List<Character> tempList, char[] ara) {
        if(tempList.size()== ara.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        } 
        for (char c : ara) {
            if (tempList.contains(c)) {
                continue;
            }
            tempList.add(c);
            backtrack(resultList, tempList, ara);
            tempList.remove(tempList.size() - 1); // Remove the last element added
        }
    }

    public static void main(String[] args) {
        
        String C = "abc";
        System.out.println(subsets(C));
    }
}
