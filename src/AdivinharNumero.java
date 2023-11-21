import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numeroCerto = random.nextInt(101);

        System.out.println("Informe um número: ");
        int numero = entrada.nextInt();

        int tentativas = 0;

        while (numero != numeroCerto){
            if (numero > numeroCerto){
                System.out.println(numero + " é maior.");
            } else {
                System.out.println(numero + " é menor.");
            }
            System.out.println("Digite outro número.");
            numero = entrada.nextInt();
            tentativas++;
        }
        System.out.println("O número %s está correto. Foram necessárias %s tentativas.".formatted(numero, tentativas));


    }
}
