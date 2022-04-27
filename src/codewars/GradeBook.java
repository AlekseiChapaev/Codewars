package codewars;

public class GradeBook {

    //https://www.codewars.com/kata/55cbd4ba903825f7970000f5/train/java

    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;
        if(average >= 90 && average <= 100){
            return 'A';
        }else if(average >= 80 && average < 90){
            return 'B';
        }else if(average >= 70 && average < 80){
            return 'C';
        }else if(average >= 60 && average < 70){
            return 'D';
        }else if(average >= 0 && average < 60){
            return 'F';
        } else {
            return '0';
        }
    }

    public static void main(String[] args) {
        System.out.println(getGrade(145, 555, 96));
    }
}
