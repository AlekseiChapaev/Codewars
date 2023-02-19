package codewars.kyu_8;
    public class Ship {
        /**
         * https://www.codewars.com/kata/54fe05c4762e2e3047000add/train/java
         */
        private final double draft;
        private final int crew;

        public Ship(double draft, int crew) {
            this.draft = draft;
            this.crew = crew;
        }

        public boolean isWorthIt(){
            double weight = draft - crew * 1.5;

            return weight > 20;
        }

        public static void main(String[] args) {
            Ship titanic = new Ship(36, 10);
            System.out.println(titanic.isWorthIt());
        }
    }