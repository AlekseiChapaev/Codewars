package codewars.kyu_8;

public class HowOldWillIBe {
    /**
     * https://www.codewars.com/kata/5761a717780f8950ce001473/train/java
     */
    public static String CalculateAge(int birth, int yearTo) {
        if (birth < yearTo && yearTo - birth == 1) {
            return "You are " + (yearTo - birth) + " year old.";
        } else if (birth < yearTo) {
        return "You are " + (yearTo - birth) + " years old.";
        } else if (birth > yearTo && birth - yearTo == 1){
            return "You will be born in " + (birth - yearTo) + " year.";
        } else if (birth > yearTo){
            return "You will be born in " + (birth - yearTo) + " years.";
        }

        return "You were born this very year!";
    }

    public static void main(String[] args) {
        System.out.println(CalculateAge(3900, 2900));
    }
}
