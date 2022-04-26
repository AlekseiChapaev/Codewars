package codewars;

public class Holiday_DutyFree {

    // https://www.codewars.com/kata/57e92e91b63b6cbac20001e5/train/java

    public static int dutyFree(int normPrice, int discount, int hol) {

        double r = normPrice * discount / 100.0;
        int res = (int)(hol / r);

        return res;
    }

    public static void main(String[] args) {

       System.out.println(dutyFree(24,35,3000));
        System.out.println(dutyFree(17,10,500));
    }
}
