public class Operadores {

    public static void main(String[] args) {
        int x = 14;
        int y = 5;
        int soma = x + y;
        int subtracao = x - y;
        int multiplicacao = x * y;
        double divisao = (double) x / y;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);


        int maiorInteiro = Integer.MAX_VALUE;
        long maiorLong = Long.MAX_VALUE;
        System.out.println("Maior inteiro: " + maiorInteiro);
        System.out.println("Maior long: " + maiorLong);

        /*
        System.out.println("Soma: " + (x + y));
        System.out.println("Subtração: " + (x - y));
        System.out.println("Multiplicação: " + (x * y));
        System.out.println("Divisão: " + (x / y));
        */
    }
}
