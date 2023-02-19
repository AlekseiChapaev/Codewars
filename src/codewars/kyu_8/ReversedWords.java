package codewars.kyu_8;

public class ReversedWords {

    //https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java

    public static String reverseWords(String str){
        String[] strArr = str.split(" ");
        String[] newStrArr = new String[strArr.length];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strArr.length; i++){
            newStrArr[i] = strArr[strArr.length - (i + 1)];
            sb.append(newStrArr[i]).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("The world is nice"));

    }
}
