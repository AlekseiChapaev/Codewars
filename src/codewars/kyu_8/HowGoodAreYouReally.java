package codewars.kyu_8;

public class HowGoodAreYouReally {

    //https://www.codewars.com/kata/5601409514fc93442500010b

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];
        }
        average = (sum + yourPoints) / (classPoints.length + 1);
        if(yourPoints > average){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(betterThanAverage(new int[] {2, 3}, 5));
    }

}
