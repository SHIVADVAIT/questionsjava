public class Solution{
    public static int [] plusOne(int [] digits){
     for(int i = digits.length - 1  ; i>=0; i--){
         if(digits[i]<9){
             digits[i]++;
             return digits;
         }
 
         digits[i] = 0;
     }
 
         int[] ans = new int[digits.length + 1];
         ans[0] = 1;
         
         return ans;
    }
    public static void main(String[] args) {
        int [] ar = {9,9,9};
        int [] ne = new int[ar.length];
        for(int i = 0 ; i<ne.length; i++)
            System.out.println(ne[i]);
    }
 }