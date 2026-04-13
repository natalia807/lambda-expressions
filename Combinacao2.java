/* Crie uma lista de nomes e: Deixe todos em maiúsculo e mostre apenas os que têm mais de 4 letras*/

import java.util.Arrays;
import java.util.List;

public class Combinacao2 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bianca", "Gabriel");

        nomes.stream()
                .map(n -> n.toUpperCase())
                .filter(n -> n.length() > 4)
                .forEach(System.out::println);
    }
    
}
