package codewars;

public class WellOfIdeas {

    //https://www.codewars.com/kata/57f222ce69e09c3630000212/train/java

    public static String well(String[] x) {
        int countGood = 0;
        for (int i = 0; i < x.length; i++) {
            if(x[i].toLowerCase().equals("good")){
                countGood++;
            }
        }
            if(countGood == 0){
            return "Fail!";
        } else if(countGood < 3){
                return "Publish!";
        } else{
                return "I smell a series!";
            }
    }

    public static void main(String[] args) {
        System.out.println(well(new String[] {"good", "bad", "bad", "bad", "bad"}));
    }
}
