package codewars.kyu_8;

public class RockPaperScissors {

    //https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java

    public static String rps(String p1, String p2) {

        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";

        if(p1.equals(p2)){
            return "Draw!";
        } else if(p1.equals(rock) && p2.equals(scissors) || p1.equals(paper) && p2.equals(rock) || p1.equals(scissors) && p2.equals(paper)){
            return "Player 1 won!";
        } else{
            return "Player 2 won!";
        }
    }

    public static void main(String[] args) {

        System.out.println(rps("rock", "paper"));

    }
}
