import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaNotas = 0;
        for(int i=1; i<5; i++){
            System.out.println("Informe a nota da prova %s: ".formatted(i));
            double nota = entrada.nextDouble();
            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
            } else {
                System.out.println("Valor inválido. Terminando o programa...");
                System.exit(1);
            }
        }
        double media = somaNotas/4;
        System.out.println("A média do aluno foi %s".formatted(media));
    }
}
