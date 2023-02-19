package codewars.kyu_7;

public class CorrectTheTimeString {
    /**
     * https://www.codewars.com/kata/57873ab5e55533a2890000c7/train/java
     */

    public static String timeCorrect(String timestring) {

        if (timestring == null || timestring.matches("\\d+:+")) {
            return null;
        } else if (timestring.length() == 0) {
            return "";
        } else {
            int countHours = 24;
            int countMinOrSec = 60;
            String[] strs = timestring.split(":");
            int[] ints = new int[strs.length];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.parseInt(strs[i]);
            }
            if (ints[0] >= countHours) {
                ints[0] = ints[0] % countHours;
            }
            if (ints[1] >= countMinOrSec) {
                ints[0] += ints[1] / countMinOrSec;
                ints[1] = ints[1] % countMinOrSec;
            }
            if (ints[2] >= countMinOrSec) {
                ints[1] += ints[2] / countMinOrSec;
                ints[2] = ints[2] % countMinOrSec;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] < 10) {
                    sb.append("0");
                }
                sb.append(ints[i]).append(":");
            }

            return sb.deleteCharAt(sb.length() - 1).toString();
        }
    }

    public static void main(String[] args) {

        System.out.println(timeCorrect("22:99:99"));
    }
}
