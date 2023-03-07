package codewars.kyu_7;

public class Ch4113ng3 {
    /**
     * https://www.codewars.com/kata/59e9f404fc3c49ab24000112
     */
    public static String nerdify(String txt){
        return txt.replaceAll("[aA]", "4").replaceAll("[eE]", "3").replaceAll("l", "1");
    }

    public static void main(String[] args) {
        System.out.println(nerdify("Fundamentals"));
    }
}
