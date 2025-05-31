public class day49 {

    public static int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        // Edge case: empty needle
        if (nLen == 0) return 0;

        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == nLen) {
                return i; // Match found at index i
            }
        }

        return -1; // No match found
    }

    public static void main(String[] args) {
        String s = "sadbutsad";
        String str = "sad";
       System.out.println( strStr(s, str));
    }
    
    }

  

