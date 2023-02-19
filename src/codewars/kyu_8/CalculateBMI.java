package codewars.kyu_8;

public class CalculateBMI {

    //https://www.codewars.com/kata/57a429e253ba3381850000fb/train/java

    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        if(bmi <= 18.5) {
            return "Underweight";
        } else if(bmi >= 18.5 && bmi <= 25.0){
            return "Normal";
        } else if(bmi >= 25.0 && bmi <= 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        System.out.println(bmi(94, 1.78));
    }
}
