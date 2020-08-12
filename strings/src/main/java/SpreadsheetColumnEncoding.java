public class SpreadsheetColumnEncoding {

    /*
    7.3
    */

    public static int decodeSpreadsheetColumn(String code) {
        int result = 1;

        for (char c : code.toCharArray()) {
            result *= (int) c - 'A' + 1;
        }

        return code.length() == 1 ? result : result + 26;
    }


}
