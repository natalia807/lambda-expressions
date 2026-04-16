/*Crie uma lista de palavras e: crie uma nova lista com palavras invertidas */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Invertidas {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Java", "Stream", "Lambda");

        List<String> invertidas = palavras.stream()
                .map(p -> new StringBuilder(p).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(invertidas);
    }
}
