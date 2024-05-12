package codewars.kyu_8;

public class RemoveTheTime {
    public static String shortenToDate(String longDate) {
        return longDate.split(",")[0];
    }

    public static void main(String[] args) {
        System.out.println(shortenToDate("Friday May 2, 10am"));
    }
}
