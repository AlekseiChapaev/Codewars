package codewars;

public class WillThereBeEnoughSpace {

    //https://www.codewars.com/kata/5875b200d520904a04000003/train/java

    public static int enough(int cap, int on, int wait){
        if((cap - on) > wait){
            return 0;
        } else{
            return wait - (cap - on);
        }
    }

    public static void main(String[] args) {
        System.out.println(enough(50, 50, 30));
    }
}
