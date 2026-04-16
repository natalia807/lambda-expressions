/*Crie uma lista de números com valores repetidos e: remova duplicados, mostre o resultado */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1 , 3);

        List<Integer> novos = numeros.stream()
                                        .distinct()
                                        .collect(Collectors.toList());
        System.out.println(novos);
}
}
