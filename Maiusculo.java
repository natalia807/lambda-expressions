/*Crie uma lista de nomes e: deixe todos em maiúsculo */

import java.util.Arrays;
import java.util.List;

public class Maiusculo {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bianca", "Gabriel");

        nomes.stream()
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
