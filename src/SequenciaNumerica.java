import java.util.Scanner;

public class SequenciaNumerica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor inicial: ");
        int valorInicial = entrada.nextInt();
        System.out.println("Informe o valor final: ");
        int valorFinal = entrada.nextInt();

        for(int i=valorInicial; i<=valorFinal; i++){
            System.out.println(i);
        }
    }
}
