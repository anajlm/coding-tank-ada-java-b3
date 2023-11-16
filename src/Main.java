// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String nome = "Ana Julia";
        int x = 10;
        double y = 10.5;
        boolean condicao = true;
        /**
         * BigDecimal a precisão é limitada pelo limite de memória da máquina e não pelo número de bytes do tipo
         */
        BigDecimal numeroGrande = new BigDecimal("100000000000000000000000000000");
        System.out.println("Boa noite, " + nome);
        System.out.println("Até logo, " + nome);
    }
}