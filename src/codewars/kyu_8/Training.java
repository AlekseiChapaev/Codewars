package codewars.kyu_8;

public class Training {

    public static int pillars(int numPill, int dist, int width) {
        if (numPill == 1) return 0;
        else if (numPill == 2) return dist * 100;
        else
            return 100 * numPill * dist + (numPill - 2) * width;
    }

    public static void main(String[] args) {
        System.out.println(pillars(2,20,25));
    }

}
