 import java.lang.Math;
 public class holo {
  public static double arr(int[] ar, int k){
    int[] newar = {};
    int sum = 0;
    int max = 0;
    for(int i = 0 ; i<=ar.length - k; i++){
        sum = 0;
        for(int j = i ; j< i + k ; j++){
               
               sum = sum + ar[j];
               max = Math.max(sum,max);

        }
    }
    return (double)max/k
    ;
  }
    public static void main(String[] args) {
        int ar[] = {1, 12,-5, -6, 50, 3};
        System.out.println(arr(ar,4));
    }
}
