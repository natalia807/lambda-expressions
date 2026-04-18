/*Crie uma lista de números e: ordene em ordem crescente, depois mostre ao contrário */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 12, 3, 20, 5, 0, 7, 15, 4, 34);

        //Ordem crescente
        System.out.println("Crescente:");
        numeros.stream()
                .sorted()
                .forEach(System.out::println);

        //Ordem decrescente
        System.out.println("Decrescente:");
        numeros.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
    
}
