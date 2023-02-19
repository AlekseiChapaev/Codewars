package codewars.kyu_8;

public class MaxDiffLength {

    public int mxdiflg(String[] a1, String[] a2) {

        if(a1.length == 0 || a2.length == 0){
            return -1;
        } else {
            int maxValueFirstArray = Integer.MIN_VALUE;
            int minValueFirstArray = Integer.MAX_VALUE;
            for (int i = 0; i < a1.length; i++) {
                for (int j = 0; j < a1[i].length(); j++) {
                    if (maxValueFirstArray < a1[i].length()) {
                        maxValueFirstArray = a1[i].length();
                    }
                }
            }
            for (int i = 0; i < a1.length; i++) {
                for (int j = 0; j < a1[i].length(); j++) {
                    if (minValueFirstArray > a1[i].length()) {
                        minValueFirstArray = a1[i].length();
                    }
                }

            }
            int minValueSecondArray = Integer.MAX_VALUE;
            int maxValueSecondArray = Integer.MIN_VALUE;
            for (int i = 0; i < a2.length; i++) {
                for (int j = 0; j < a2[i].length(); j++) {
                    if (minValueSecondArray > a2[i].length()) {
                        minValueSecondArray = a2[i].length();
                    }
                }
            }
            for (int i = 0; i < a2.length; i++) {
                for (int j = 0; j < a2[i].length(); j++) {
                    if (maxValueSecondArray < a2[i].length()) {
                        maxValueSecondArray = a2[i].length();
                    }
                }
            }
            if(maxValueFirstArray - minValueSecondArray > maxValueSecondArray - minValueFirstArray){
                return Math.abs(maxValueFirstArray - minValueSecondArray);
            } else {
                return Math.abs(maxValueSecondArray - minValueFirstArray);
            }
        }
    }

    public static void main(String[] args) {

        MaxDiffLength dif = new MaxDiffLength();

        String[] a1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] a2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

        System.out.println(dif.mxdiflg(a1, a2));
    }
}
