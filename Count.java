/*Crie uma lista de nomes e: conte quantos começam com "M" */

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
    List<String> nomes = Arrays.asList("Maria", "Julia", "Pedro");

    long quantidade = nomes.stream()
                .filter(n -> n.startsWith("M"))
                .count();

        System.out.println("Quantidade: " + quantidade);
    }
    
}
