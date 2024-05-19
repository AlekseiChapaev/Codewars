package codewars.kyu_7;

public class Isograms {

    //https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java

    public static boolean isIsogram(String str) {

        return str.length() == str.toLowerCase().chars().distinct().toArray().length;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("moose"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram("thumbscrewjapingly"));
        System.out.println(isIsogram(""));
    }
}
