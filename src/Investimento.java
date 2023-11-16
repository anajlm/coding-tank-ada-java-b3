import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor inicial investido em R$.");
        double valorInicial = entrada.nextDouble();
        System.out.println("Informe o juros ao mês em %.");
        double jurosAoMes = entrada.nextDouble()/100;
        System.out.println("Informe o tempo em meses que o dinheiro ficará investido.");
        int tempo = entrada.nextInt();

        double saldo = valorInicial;
        for(int i = 1; i <= tempo; i++){
            double juros = saldo*jurosAoMes;
            saldo += juros;
            System.out.println("Mês %s: Juros: %s, saldo: %s".formatted(i, juros, saldo));
        }
    }

}
