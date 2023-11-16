public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        System.out.println("Temperatura 1 %s C são %s F".formatted(10, getTemperatureInFahrenheit(10)));
        System.out.println("Temperatura 2 %s C são %s F".formatted(20, getTemperatureInFahrenheit(20)));

    }

    private static double getTemperatureInFahrenheit(double celsius){
        double fator1 = 9/5;
        double fator2 = 32;
        return (celsius * fator1) + fator2;
    }

}
