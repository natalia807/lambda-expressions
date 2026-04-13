/*Crie uma lista de números e: Filtre os pares, Multiplique por 10, Mostre o resultado */

import java.util.Arrays;
import java.util.List;

public class Combinacao {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        numeros.stream()
                .filter(n -> n % 2 == 0)   // filtra pares
                .map(n -> n * 10)          // multiplica por 10
                .forEach(System.out::println); // imprime
    }
}
