public class InterconvertStringAndInteger {

    /*
    7.1
    */

    public static Integer stringToInt(String number) {
        char[] st;
        if (number.charAt(0) == '-') st = number.substring(1).toCharArray(); // account for negative number
        else st = number.toCharArray();
        int result = 0;
        int exp = st.length - 1; // power of 10

        for (int i = 0; i < st.length; i++) {
            int temp = st[i] - '0'; // ASCII for 0 == 48
            temp *= Math.pow(10, exp--); // digit placement (ie *100 for hundredths place)
            result += temp;
        }

        if (number.charAt(0) == '-') result *= -1; // add negative back in

        return result;
    }

    public static String intToString(Integer number) {
        if (number == 0) return "0";
        StringBuilder result = new StringBuilder();
        int next, remainder;
        next = Math.abs(number); // take out negative

        while (next > 0) {
            remainder = next % 10; // get last digit
            result.append(remainder); // add last digit to the result string
            next = next / 10; // remove last digit
        }

        if (number < 0) result.append("-"); // add negative back in
        result.reverse(); // append adds to the end of the string, so need to reverse

        return result.toString();
    }

}
