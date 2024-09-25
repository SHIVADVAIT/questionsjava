public class javas {
     public static int climb(int s){

           int[] arr = new int[s];
           arr[1] = 1;
           arr[2] =  2;
        for(int i = 3 ; i<=s ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[s];
     }
    public static void main(String[] args) {
        System.out.println("Heello");
        System.out.println('z'-'a');
    }
}
