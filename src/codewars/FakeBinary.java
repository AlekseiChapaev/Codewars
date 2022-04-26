package codewars;

public class FakeBinary {

    //https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java

        public static String fakeBin(String numberString) {
       char[] arr = numberString.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if((arr[i] - 48) < 5){
                arr[i] = '0';
            } else{
                arr[i] = '1';
            }
        }

        return String.valueOf(arr);
    }

    // return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");

    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
        char ch = '5';
    }
}
