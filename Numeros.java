/*Crie uma lista de números e: filtre os números maiores que 10, multiplique por 2
e mostre o resultado */

import java.util.Arrays;
import java.util.List;

public class Numeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 15, 20, 34);

        numeros.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
    
}
