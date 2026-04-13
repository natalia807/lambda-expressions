/*Crie uma lista de números e: Crie uma nova lista com os números ao quadrado */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map1 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> quadrados = numeros.stream()
                .map(n -> n * n) 
                .collect(Collectors.toList()); 

        System.out.println(quadrados);
    }
}
