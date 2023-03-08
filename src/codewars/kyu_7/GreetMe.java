package codewars.kyu_7;

public class GreetMe {
    /**
     * https://www.codewars.com/kata/535474308bb336c9980006f2/train/java
     */
    public static String greet(String name){
        return "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet("JACK"));
    }
}
