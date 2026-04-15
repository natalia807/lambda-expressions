/*Crie uma lista de números e: filtre os ímpares e crie uma nova lista com o dobro desses números */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dobro {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 15, 20, 34);

        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 != 0)     // pega ímpares
                .map(n -> n * 2)             // dobra
                .collect(Collectors.toList()); // nova lista

        System.out.println(resultado);
    }
}
