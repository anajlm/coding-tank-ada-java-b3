import java.util.Scanner;

public class TrianguloRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base = entrada.nextInt();

        for(int i=base; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
