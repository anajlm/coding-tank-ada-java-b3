/**
 * Exemplo 1
 */

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua altura em metros: ");
        double altura = entrada.nextDouble();
        System.out.println("Informe seu peso em kg: ");
        double peso = entrada.nextDouble();
        double imc = peso/(altura*altura);
        System.out.println("O valor do seu IMC é: " + imc);
    }
}
