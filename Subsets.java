
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nikoo28 on 7/20/19 1:57 PM
 */

class Subsets {

  public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> resultList = new ArrayList<>();

    // Start backtracking from the beginning
    backtrack(resultList, new ArrayList<>(), nums, 0);
    return resultList;
  }

  public static void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet,
                         int[] nums, int start) {
    // Add the set to result set
    resultSets.add(new ArrayList<>(tempSet));
    for (int i = start; i < nums.length; i++) {

      // Case of including the number
      tempSet.add(nums[i]);

      // Backtrack the new subset
      backtrack(resultSets, tempSet, nums, i + 1);

      // Case of not-including the number
      tempSet.remove(tempSet.size() - 1);
    }
  }



  public static void main(String[] args) {
    int[] nums = {1,2,3};
    System.out.println(subsets(nums));
    
    List<List<Integer>> subset = new ArrayList<List<Integer>>() {{
        add(Arrays.asList(1));
        add(Arrays.asList(1, 2));
    }};
    System.out.println(subset);

  }
}