import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas palavras serão informadas?");
        int numPalavras = entrada.nextInt();

        String a[];
        a = new String[numPalavras];

        for(int i = 0; i<numPalavras; i++){
            System.out.println("Escreva a palavra " + (i+1));
            a[i] = entrada.next();
        }

        for(int j=numPalavras-1; j>=0; j--){
            System.out.print(a[j]);
            if (j>0){
                System.out.print(", ");
            }
        }
        System.out.println(".");


    }
}
