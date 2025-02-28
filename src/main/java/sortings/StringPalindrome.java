package sortings;

public class StringPalindrome {
    public static String palidromeHelper(String str, String res, int ind) {
        if(str.length() == ind) {
            return res;
        }
        //System.out.println(str + " " + res + "  " + ind);
        return palidromeHelper(str, str.charAt(ind)+res, ind +1);
    }
    public static boolean isPalindrome(String str) {
        String res = palidromeHelper(str, "", 0);
        //System.out.println(res );
        return str.equals(res);
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
