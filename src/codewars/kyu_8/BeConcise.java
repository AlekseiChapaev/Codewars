package codewars.kyu_8;

public class BeConcise {
    /**
     * https://www.codewars.com/kata/56f3f6a82010832b02000f38/train/java
     */
    public static String describeAge(int age){

        //String s="You're a(n) ";
        //return age < 13 ? s+"kid" : age < 18 ? s + "teenager" : age < 65 ? s+"adult" : s+"elderly";

        return "You're a(n) " + (age < 13 ? "kid" : age < 18 ? "teenager" : age < 65 ? "adult" : "elderly");
        //{return"You're a(n) "+(a<13?"kid":a<18?"teenager":a<65?"adult":"elderly");}}
    }

    public static void main(String[] args) {
        System.out.println(describeAge(100));
    }
}
