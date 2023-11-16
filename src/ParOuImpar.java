public class ParOuImpar {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Número inválido de argumentos, é esperado que seja informado um argumento.");
            System.exit(1);
        }

        int numero = Integer.parseInt(args[0]);
        if(numero % 2 == 0){
            System.out.println("Esse número é par.");
        } else {
            System.out.println("Esse número é impar.");
        }
    }
}
