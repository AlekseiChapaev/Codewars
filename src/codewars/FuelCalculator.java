package codewars;

public class FuelCalculator {
    /**
     * https://www.codewars.com/kata/57b58827d2a31c57720012e8/train/java
     */
    public static double fuelPrice(int litres, double pricePerLitre) {
        if(litres >= 2 && litres < 4){
            return litres * (pricePerLitre - 0.05);
        } else if(litres >= 4 && litres < 6){
            return litres * (pricePerLitre - 0.1);
        } else if(litres >= 6 && litres < 8){
            return litres * (pricePerLitre - 0.15);
        } else if(litres >= 8 && litres < 10){
            return litres * (pricePerLitre - 0.2);
        } else if(litres >= 10 ){
            return litres * (pricePerLitre - 0.25);
        } else return pricePerLitre * litres;
    }
}
