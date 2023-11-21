import java.util.Scanner;

public class TecladoCelular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aperte uma tecla: 1 2 3 4 5 6 7 8 9");
        int tecla = scanner.nextInt();

        String[] palavra;
        palavra = new String[10];

        int i = 0;
        while (tecla != 1) {
            switch (tecla) {
                case 1:
                    break;
                case 2:
                    palavra[i] = "a";
                    for (int j=0; j<i+1; j++){
                        System.out.print(palavra[j]);
                    }
                    System.out.println();
                    tecla = scanner.nextInt();
                        if(tecla == 2){
                            palavra[i] = "b";
                            for (int j=0; j<i+1; j++){
                                System.out.print(palavra[j]);
                            }
                            System.out.println();
                            tecla = scanner.nextInt();
                            if(tecla == 2){
                                palavra[i] = "c";
                                for (int j=0; j<i+1; j++){
                                    System.out.print(palavra[j]);
                                }
                                System.out.println();
                                tecla = scanner.nextInt();
                            }

                        }
                        break;

            }

            i++;
        }
    }
}
