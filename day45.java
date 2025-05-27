public class day45 {

    public static void Per(String str , String ans){
 
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            
             char curr = str.charAt(i);
             String NewStr = str.substring(0, i) + str.substring(i+1);
             Per(NewStr  , ans+curr);
        }

    } 
    public static void main(String[] args) {
         String str  = "abc";
         Per(str, "");
    }

}