package codewars.kyu_7;

public class HowLongShouldYouCookThis {

    //https://www.codewars.com/kata/5aefd0a686d075d5f3000091/train/java

    public static String getTime(String neededPower, int minutes, int seconds, String power) {

        int timeInSec = minutes * 60 + seconds;
        double res = 1.0 * Integer.parseInt(neededPower.replace("W", "")) / Integer.parseInt(power.replace("W", "")) * timeInSec;

        int hours = (int)res / 60;
        int sec = (int)Math.ceil(res % 60);
        if (sec == 60) {
            hours +=1;
            sec -= 60;
        }

        return String.format("%s minutes %s seconds", hours, sec);
    }

    public static void main(String[] args) {
        System.out.println(getTime("21W", 64, 88, "25W"));
    }
}
