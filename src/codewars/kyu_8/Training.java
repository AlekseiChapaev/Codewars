package codewars.kyu_8;

public class Training {

    public static String printRow(int size) {
        String str = "";
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                str = str.concat("1");
            } else{
                str = str.concat("0");
            }
        }

        return str;
    }

    public static void main(String[] args) {

        System.out.println(printRow(12));
    }

}
