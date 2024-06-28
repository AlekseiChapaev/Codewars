package codewars.kyu_8;

public class IsItANumber {
    public static boolean isDigit(String s) {
        return s.matches("-?\\d*\\.?\\d+");
              /*  \\s*"      // any amount of whitespace
                + "-?"      // optional negative sign
                + "\\d+"    // one or more digits
                + "(:?"     // start of factional part
                + "\\."   // literal period
                + "\\d+"  // one or more digits
                + ")?"      // fractional part is optional
                + "\\s*";   // any amount of whitespace
               */
    }

    public static void main(String[] args) {
        System.out.println(isDigit("4.0216218019206723"));
    }
}
