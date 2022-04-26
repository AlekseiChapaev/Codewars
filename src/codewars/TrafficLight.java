package codewars;

public class TrafficLight {

    //https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java

    public static String updateLight(String current) {
            if(current.equals("red")) {
                return "green";
            } else if(current.equals("green")){
                return "yellow";
            } else if(current.equals("yellow")){
                return "red";
            } else{
                return "";
            }
    }

    public static void main(String[] args) {

    }
}
