package codewars;

public class TotalAmountOfPoints {

    //https://www.codewars.com/kata/5bb904724c47249b10000131

    public static int points(String[] games) {
        int result = 0;
        for (int i = 0; i < games.length; i++) {
            if(Math.round(Double.parseDouble(games[i].replace(':', '.')) / 1) == Math.round((Double.parseDouble(games[i].replace(':', '.')) * 10) % 10)){
                result += 1;
            } else if(Math.round(Double.parseDouble(games[i].replace(':', '.')) / 1) > Math.round((Double.parseDouble(games[i].replace(':', '.')) * 10) % 10)){
                result += 3;
            } else{
                result += 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(points(new String[]{"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"}));
    }
}
