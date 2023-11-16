import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de provas: ");
        int numProvas = entrada.nextInt();
        int[] notas;
        notas = new int[numProvas];

        for(int i=0; i<numProvas; i++){
            System.out.println("Informe a nota da prova %s: ".formatted(i));
            notas[i] = entrada.nextInt();
        }

        int mediaNotas = getMediaNotas(notas);
        int notaMax = getNotaMax(notas);
        int notaMin = getNotaMin(notas);

        System.out.println("A menor nota é: " + notaMin);
        System.out.println("A maior nota é: " + notaMax);
        System.out.println("A media das notas é: " + mediaNotas);

    }

    private static int getMediaNotas(int[] notas){
        int somaNotas = 0;
        for(int i=0; i<notas.length; i++){
            somaNotas += notas[i];
        }
        return somaNotas/notas.length;
    }

    private static int getNotaMax(int[] notas){
        int notaMax = notas[0];
        for(int i=0; i<notas.length; i++){
            if(notas[i] > notaMax){
                notaMax = notas[i];
            };
        }
        return notaMax;
    }

    private static int getNotaMin(int[] notas){
        int notaMin = notas[0];
        for(int i=0; i<notas.length; i++){
            if(notas[i] < notaMin){
                notaMin = notas[i];
            };
        }
        return notaMin;
    }
}
