import java.util.Scanner;

public class Antecessores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int num = entrada.nextInt();

        int soma = 0;
        for (int i=0; i<num; i++){
            soma += num-i;
        }

        System.out.println("A soma dos antecessores positivos é " + soma);
    }
}
