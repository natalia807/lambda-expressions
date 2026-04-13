/*Crie uma lista de nomes e: Mostre apenas os que começam com "A" */

import java.util.Arrays;
import java.util.List;

public class Filter2 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Maria", "Ana", "Julia", "Pedro", "Amanda");

        nomes.stream()
                .filter(n -> n.startsWith("A")) 
                .forEach(System.out::println); 
    }
}