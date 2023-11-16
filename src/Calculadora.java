import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual operação deseja fazer? ( opções: + - / * )");
        String operacao = entrada.nextLine();

        int a[] = {0, 0};

        switch (operacao) {
            case "+":
                a = getTwoNumbers();
                int soma = a[0] + a[1];
                System.out.println("Soma: " + soma);
                break;
            case "-":
                a = getTwoNumbers();
                int subtracao = a[0] - a[1];
                System.out.println("Subtracao: " + subtracao);
                break;
            case "/":
                a = getTwoNumbers();
                int divisao = a[0] + a[1];
                System.out.println("Divisao: " + divisao);
                break;
            case "*":
                a = getTwoNumbers();
                int multiplicacao = a[0] + a[1];
                System.out.println("Multiplicacao: " + multiplicacao);
                break;
            default:
                System.out.println("Operação desconhecida");
                System.exit(1);

        }
    }

    private static int[] getTwoNumbers(){
        int a[] = {0, 0};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro número.");
        a[0] = entrada.nextInt();
        System.out.println("Informe o segundo número.");
        a[1] = entrada.nextInt();
        return a;
    }
}
