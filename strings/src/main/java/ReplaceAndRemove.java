public class ReplaceAndRemove {

    /*
    7.4
    */

    public static String replaceAndRemove(char[] s, int k) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < k; i++) {
            if (s[i] == 'a') result.append("dd");
            else if (s[i] != 'b') result.append(s[i]);
        }

        return result.toString();
    }

}
