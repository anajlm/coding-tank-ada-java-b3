import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o coeficiente a: ");
        double a = entrada.nextDouble();

        System.out.println("Informe o coeficiente b: ");
        double b = entrada.nextDouble();

        System.out.println("Informe o coeficiente c: ");
        double c = entrada.nextDouble();

        double delta = Math.pow(b,2) - 4*a*c;
        System.out.println("o delta é igual a " + delta);

        double sqrtDelta = Math.sqrt(delta);

        double x1 = (-b + sqrtDelta)/(2*a);
        System.out.println("X1 é igual a " + x1);
        double x2 = (-b - sqrtDelta)/(2*a);
        System.out.println("X2 é igual a " + x2);

    }
}
