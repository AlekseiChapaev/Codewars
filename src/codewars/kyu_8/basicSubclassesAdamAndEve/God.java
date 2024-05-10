package codewars.kyu_8.basicSubclassesAdamAndEve;

public class God {
    public Human[] create() {
        return new Human[]{new Man(), new Woman()};
    }
}

    abstract class Human {};

    class Man extends Human {};

    class Woman extends Human {};


