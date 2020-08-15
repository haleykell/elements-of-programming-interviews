import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInASentence {

    /*
    7.6
    */

    public static String reverseWordsInASentence(String input) {
        List<String> st = Arrays.asList(input.split(" "));
        Collections.reverse(st);
        input = "";

        for (String s : st) {
            input += s + " ";
        }

        return input.trim();
    }
}
