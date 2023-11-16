import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        if(args.length > 2){
            System.out.println("Quantidade de argumentos inválida. Insira 2 argumentos.");
            System.exit(1);
        }

        for(int i=0; i<2; i++){
            if(args.length - i > 0){
                soma += Integer.parseInt(args[i]);
            } else {
                System.out.println("Entre com um número: ");
                soma += entrada.nextInt();
            }
        }

        System.out.println("Soma: " + soma);

    }
}
