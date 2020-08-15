public class PalindromeAlphanumeric {

    /*
    7.5
    */

    public static boolean isPalindrome(String input) {
        int i = 0;
        int j = input.length() - 1;

        while (i < j) {
            if (!Character.isLetterOrDigit(input.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(input.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toLowerCase(input.charAt(i++)) != Character.toLowerCase(input.charAt(j--))) return false;
        }

        return true;
    }
}
