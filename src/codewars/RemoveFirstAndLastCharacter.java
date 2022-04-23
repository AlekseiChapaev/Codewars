package codewars;

public class RemoveFirstAndLastCharacter {

    //https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0

    public static String remove(String str) {

        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(remove("Hello"));

    }
}
