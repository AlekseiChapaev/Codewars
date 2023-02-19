package codewars;

public class PrintingArrayElementswithCommaDelimiters {
    /**
     * https://www.codewars.com/kata/56e2f59fb2ed128081001328/train/java
     */
    public static String printArray(Object[] array) {
        StringBuilder sb = new StringBuilder();
        for(Object o : array){
            sb.append(o).append(",");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static void main(String[] args) {
        System.out.println(printArray(new String[]{"2","4","5","2"}));
    }
}
