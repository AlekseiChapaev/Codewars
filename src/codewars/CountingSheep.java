package codewars;

public class CountingSheep {

    //https://www.codewars.com/kata/54edbc7200b811e956000556

    public int countSheeps(Boolean[] arrayOfSheeps) {

        if(arrayOfSheeps != null) {
            int count = 0;
            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (arrayOfSheeps[i] != null && arrayOfSheeps[i].equals(true)) {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
