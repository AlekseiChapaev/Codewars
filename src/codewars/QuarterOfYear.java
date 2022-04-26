package codewars;

public class QuarterOfYear {

    //https://www.codewars.com/kata/5ce9c1000bab0b001134f5af/train/java

    public static int quarterOf(int month) {
        if(month > 0 && month < 4){
            return 1;
        } else if(month > 3 && month < 7){
            return 2;
        } else if(month > 6 && month < 10) {
            return 3;
        } else if(month > 8 && month < 13) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
    }
}
