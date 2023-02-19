package codewars.kyu_8;

public class UpperCaseToLowerCase {

    //https://www.codewars.com/kata/56efc695740d30f963000557/train/java

    public static String toAlternativeString(String string) {
        char[] arr = string.toCharArray();
        char[] newArr = new char[arr.length];
        String[] stringArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(Character.isUpperCase(arr[i])){
                newArr[i] = Character.toLowerCase(arr[i]);
            } else{
                newArr[i] = Character.toUpperCase(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < newArr.length; i++) {
            sb.append(newArr[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("HELLO world"));
    }
}
