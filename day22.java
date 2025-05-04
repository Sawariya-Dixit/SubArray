
import java.util.Arrays;

public class day22 {
    
    public static boolean isAnagram(String s, String t) {
        char chr1[] = s.toCharArray();
        Arrays.sort(chr1);

        char chr2[] = t.toCharArray();
        Arrays.sort(chr2);

        return Arrays.equals(chr1,chr2);
    }
    public static void main(String[] args) {
        String s = "yash";
        String t = "ashy";
       System.out.println( isAnagram(s,t));
    }
}




    
