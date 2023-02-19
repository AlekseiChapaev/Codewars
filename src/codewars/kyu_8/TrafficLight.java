package codewars.kyu_8;

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

    public static String updateLight2(String current) {
        switch(current){
            case "red": return "green";
            case "green": return "yellow";
            case "yellow": return "red";
            default: return "BOLT!";
        }
    }

    public static void main(String[] args) {
        System.out.println(updateLight2("reddf"));

    }
}
