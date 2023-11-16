import java.util.Scanner;

public class TabelaPrice {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do empréstimo: ");
        double valorEmprestimo = entrada.nextDouble();
        System.out.println("Informe a taxa de juros: ");
        double taxaJuros = entrada.nextDouble()/100;
        System.out.println("Informe o tempo para pagamento (em meses): ");
        int numParcelas = entrada.nextInt();


        double valorPrestacao = valorEmprestimo * ((Math.pow(1+taxaJuros, numParcelas)*taxaJuros)/(Math.pow(1+taxaJuros, numParcelas) - 1));
        double saldoDevedor = valorEmprestimo;
        double juros = 0;
        double totalJuros = 0;
        double amortizacao = 0;
        double totalAmortizacao = 0;

        System.out.println("Valor fixo da parcela: %s, Sado devedot total: %s.".formatted(valorPrestacao, saldoDevedor));

        for(int i=1; i<=numParcelas; i++){
            juros = saldoDevedor*taxaJuros;
            totalJuros += juros;
            amortizacao = valorPrestacao - juros;
            totalAmortizacao += amortizacao;
            saldoDevedor -= amortizacao;
            System.out.println("Parcela %s | Juros: R$ %.2f | Amortizacao: R$ %.2f | Saldo devedor: R$ %.2f".formatted(i, juros, amortizacao, saldoDevedor));
        }

        System.out.println("Total: Prestacao R$ %.2f, Juros R$ %.2f, Amortizacao R$ %.2f".formatted(valorPrestacao*numParcelas, totalJuros, totalAmortizacao));

    }
}
