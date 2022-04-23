package codewars;

public class AreaOrPerimeter {

    //https://www.codewars.com/kata/5ab6538b379d20ad880000ab

    public static int areaOrPerimeter (int l, int w) {
        if(l == 0 || w == 0){
            return 0;
        } else if(l == w){
            return l * w;
        } else {
            return 2 * (l + w);
        }
    }

    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(5,5));
    }
}
