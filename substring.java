
public class substring {
    public static boolean substring(String  string, String mainss){
        int l = mainss.length();
        int m = string.length();
       for(int i = 0 ; i<= l-m; i++){
        int j;
        for(j = 0 ; j<string.length(); j++){
            if(string.charAt(j)!= mainss.charAt(i+j)){
                break;
            }
          
        }
       
        if(j == string.length())
        return true;
       }
       

 return false;
    }
    public static void main(String[] args) {
        String s = "COo im My";
        String q = "My";
        System.out.println(substring(q, s));
        
    }

}
