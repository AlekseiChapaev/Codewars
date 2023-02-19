package codewars.kyu_8;

public class NeedleInTheHaystack {

    //https://www.codewars.com/kata/56676e8fabd2d1ff3000000c

    public static String findNeedle(Object[] haystack) {
        int index = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                index = i;
            }
        }

        return "found the needle at position " + index;
    }

    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[]{"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false}));
    }
}