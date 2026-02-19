package app;
import models.Hamburguer;
class Main {
    public static void main(String[] args) {
        // Hamburguer 1
        Hamburguer h1 = new Hamburguer.Builder("Brioche", "Res")
                            .cheese()
                            .lettuce()
                            .tomato()
                            .build();

        // Hamburguer 2
        Hamburguer h2 = new Hamburguer.Builder("Integral", "Pollo")
                            .ketchup()
                            .cheese()
                            .build();

        // Results
        System.out.println(h1);
        System.out.println(h2);
    }
}