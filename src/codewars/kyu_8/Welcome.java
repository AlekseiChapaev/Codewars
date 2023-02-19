package codewars.kyu_8;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    /**
     * https://www.codewars.com/kata/577ff15ad648a14b780000e7/train/java
     */

    public static String greet(String language) {
        Map<String, String> mapGreet = new HashMap<>();
        mapGreet.put("english", "Welcome");
        mapGreet.put("czech", "Vitejte");
        mapGreet.put("danish", "Velkomst");
        mapGreet.put("dutch", "Welkom");
        mapGreet.put("estonian", "Tere tulemast");
        mapGreet.put("finnish", "Tervetuloa");
        mapGreet.put("flemish", "Welgekomen");
        mapGreet.put("french", "Bienvenue");
        mapGreet.put("german", "Willkommen");
        mapGreet.put("irish", "Failte");
        mapGreet.put("italian", "Benvenuto");
        mapGreet.put("latvian", "Gaidits");
        mapGreet.put("lithuanian", "Laukiamas");
        mapGreet.put("polish", "Witamy");
        mapGreet.put("spanish", "Bienvenido");
        mapGreet.put("swedish", "Valkommen");
        mapGreet.put("welsh", "Croeso");

        if (mapGreet.containsKey(language)) {
            return mapGreet.get(language);
        } else
            return mapGreet.get("english");
    }

    public static void main(String[] args) {
        System.out.println(greet("estonian"));
    }
}
