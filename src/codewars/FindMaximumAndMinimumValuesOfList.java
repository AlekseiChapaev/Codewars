package codewars;

public class FindMaximumAndMinimumValuesOfList {

    // https://www.codewars.com/kata/577a98a6ae28071780000989/train/java

    public int min(int[] list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if(min > list[i]){
                min = list[i];
            }
        }

        return min;
    }

    public int max(int[] list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++) {
            if(max < list[i]){
                max = list[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
