public class BaseConversion {

    /*
    7.2
    */

    public static String baseConversion(String s, int b1, int b2) {
        char[] st = s.charAt(0) == '-' ? s.substring(1).toCharArray() : s.toCharArray();
        int sum = 0;

        for (char c : st) {
            sum *= b1;
            sum += Character.isDigit(c) ? c - '0' : c - 'A' + 10;
        }

        String result = s.charAt(0) == '-' ? "-" : "";
        result += convertBase(sum, b2);

        return result;
    }

    public static String convertBase(int sum, int b2) {
        int current = sum % b2;
        return sum == 0 ? "" : convertBase(sum / b2, b2) + (char) (current > 9 ? 'A' + current - 10 : current + '0');
    }
}
