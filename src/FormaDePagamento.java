import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class FormaDePagamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o valor da compra?");
        double valCompra = entrada.nextDouble();
        System.out.println("Qual a forma de pagamento?");
        entrada.nextLine();
        String formaPagamento = entrada.nextLine();

        double valorComDesconto;

        switch (formaPagamento.toUpperCase()){
            case "CREDITO":
            case "DEBITO":
                System.out.println("A sua compra possui 3% de desconto.");
                valorComDesconto = valCompra * (1-0.03);
                System.out.println("Totalizando R$ %.2f".formatted(valorComDesconto));
                break;

            case "CHEQUE":
                System.out.println("A sua compra possui 6% de desconto.");
                valorComDesconto = valCompra * (1-0.06);
                System.out.println("Totalizando R$ %.2f".formatted(valorComDesconto));
                break;

            case "DINHEIRO":
            case "PIX":
                System.out.println("A sua compra possui 12% de desconto.");
                valorComDesconto = valCompra * (1-0.12);
                System.out.println("Totalizando R$ %.2f".formatted(valorComDesconto));
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

}
