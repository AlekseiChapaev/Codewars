package codewars.kyu_8;

public class BinToDecimal {

    //https://www.codewars.com/kata/57a5c31ce298a7e6b7000334/train/java

    //110101 это 1*2pow5+ 1*2pow4+ 0*2pow3+ 1*2pow2+ 0*2pow1+1*2pow0= 32 + 16 + 4 + 1 = 53

//    public static int binToDecimal(String inp){
//        int count = 0;
//        for (int i = 0; i < inp.length(); i++) {
//            count += (inp.charAt(i) - 48) * Math.pow(2, (inp.length() - 1) - i);
//        }
//
//        return count;
//    }

    public static int binToDecimal(String inp){
        return Integer.parseInt(inp, 2);
    }

    public static void main(String[] args) {
        System.out.println(binToDecimal("110101") + 1);
    }
}
