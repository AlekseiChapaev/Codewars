package codewars;

public class AgeRangeCompatibilityEquation {
    /**
     * https://www.codewars.com/kata/5803956ddb07c5c74200144e/train/java
     */

    public static String datingRange(int age) {
        int min = 0;
        int max = 0;
        if(age >= 1 && age <= 14){
            min = (int)(age - Math.ceil(0.10 * age));
            max = (int)(age + (0.10 * age));
        } else if(age > 14 && age <= 100){
            min = (int)(Math.ceil(age / 2) + 7);
            max = (age - 7) * 2;
        }

        return min + "-" + max;
    }

    public static void main(String[] args) {
        System.out.println(datingRange(8));
    }
}
