package codewars.kyu_8;

public class FindNearestSquareNumber {

    //https://www.codewars.com/kata/5a805d8cafa10f8b930005ba/train/java
    public static int nearestSq(final int n){
        double sqrt =  Math.pow(n, 0.5);
        double ceil = Math.ceil(sqrt);
        double floor = Math.floor(sqrt);

        if (n * 1.0 == sqrt) return n;
        else if(Math.abs(Math.pow(ceil, 2) - n) < Math.abs(Math.pow(floor, 2) - n)) return (int)Math.pow(ceil, 2);
        else return (int)Math.pow(floor, 2);
    }

    public static void main(String[] args) {
        System.out.println(nearestSq(111));

    }
}
