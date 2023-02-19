package codewars.kyu_8;

public class DuckDuckGoose {
    public static String duckDuckGoose(String[] players, int goose) {
        while(goose > players.length){
            goose -= players.length;
        }

        return players[goose - 1];
    }

    public static void main(String[] args) {
        String[] players = new String[] {"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"};
        System.out.println(duckDuckGoose(players, 3));
    }
}
