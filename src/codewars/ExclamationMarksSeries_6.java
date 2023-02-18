package codewars;

public class ExclamationMarksSeries_6 {
    /**
     * https://www.codewars.com/kata/57faf7275c991027af000679/train/java
     */
    public static String remove(String s, int n){
        for (int i = 0; i < n; i++) {
            if(s.contains("!")){
                s = s.replaceFirst("!", "");
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(remove("!!!Hi !!hi!!! !hi", 3));
    }
}
