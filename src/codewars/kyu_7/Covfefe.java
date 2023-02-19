package codewars.kyu_7;

public class Covfefe {
    /**
     * https://www.codewars.com/kata/592fd8f752ee71ac7e00008a/train/java
     */
    public static String covfefe(String tweet) {
        if(tweet.contains("coverage")){
            tweet = tweet.replaceAll("coverage", "covfefe");
        } else{
            tweet = tweet + " covfefe";
        }

        return tweet;
    }

    public static void main(String[] args) {
        System.out.println(covfefe("coverage coverage"));
    }
}
