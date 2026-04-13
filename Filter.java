/*Crie uma lista de números e: Mostre apenas os números pares */
import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        numeros.stream()
                .filter(n -> n % 2 == 0) 
                .forEach(System.out::println); 
    }
}