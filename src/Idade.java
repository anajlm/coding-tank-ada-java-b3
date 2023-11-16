import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, qual o seu nome?");
        String nome = entrada.nextLine();
        System.out.println("Boa noite, " + nome);
        System.out.println("Qual o seu ano de nascimento?");
        int anoNascimento = entrada.nextInt();
        int idade = 2023 - anoNascimento;
        System.out.println("No final de 2023 você terá " + idade + " anos.");
        // outras opções de interpolação
        System.out.printf("No final de 2023 você terá %s anos.\n", idade);
        System.out.println(String.format("No final de 2023 você terá %s anos.", idade));
        System.out.println("No final de 2023 você terá %s anos.".formatted(idade));
    }
}
