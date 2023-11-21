import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = entrada.nextInt();

        int fatorial = 1;
        for (int i=num; i>=1; i--){
            fatorial *= i;
            System.out.print(i + " x ");
        }
        System.out.println();
        System.out.println("%s! = %s".formatted(num, fatorial));
    }
}
