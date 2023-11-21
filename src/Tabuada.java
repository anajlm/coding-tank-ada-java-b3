public class Tabuada {
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            System.out.println("Tabuada do %s: ".formatted(i));
            for(int j=1; j<=10; j++){
                int resultado;
                System.out.println("%s x %s = %s".formatted(i, j, i*j));
            }

        }
    }
}
