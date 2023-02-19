package codewars.kyu_8;

public class Varargs {
    /**
     * https://www.codewars.com/kata/55c90cad4b0fe31a7200001f/train/java
     */

    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }

    public static void main(String[] args) {
        System.out.println(buildString("Cheese", "Milk", "Chocolate"));
    }
}
