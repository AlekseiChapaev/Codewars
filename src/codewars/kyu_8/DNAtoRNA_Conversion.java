package codewars.kyu_8;

public class DNAtoRNA_Conversion {

    //https://www.codewars.com/kata/5556282156230d0e5e000089/train/java

    public static String dnaToRna(String dna) {
        if(dna.contains("t")){
            dna.toUpperCase();
        }
        return dna.replace("T", "U");
    }

    public static void main(String[] args) {
        System.out.println(dnaToRna("TTTT"));
    }
}
