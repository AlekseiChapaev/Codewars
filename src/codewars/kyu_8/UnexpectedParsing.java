package codewars.kyu_8;

import java.util.HashMap;

/**
 * https://www.codewars.com/kata/54fdaa4a50f167b5c000005f/train/java
 */
public class UnexpectedParsing {
    public static HashMap<String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();

        if (isBusy) {
            status.put("status", "busy");
        } else {
            status.put("status", "available");
        }

        return status;
    }

    public static void main(String[] args) {
        System.out.println(getStatus(true).get("status"));
    }
}
