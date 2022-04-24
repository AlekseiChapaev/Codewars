package codewars;

import java.util.Arrays;

public class NeedleInTheHaystack {

    //https://www.codewars.com/kata/56676e8fabd2d1ff3000000c

    public static String findNeedle(Object[] haystack) {
        String[] newArr = Arrays.toString(haystack).split(",");
        int index = 0;
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i].contains("needle")) {
                index = i;
            }
        }

        return "found the needle at position " + index;
    }

    public static void main(String[] args) {

        System.out.println(findNeedle(new Object[]{1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54}));
    }
}
