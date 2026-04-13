/*Crie uma lista de números e: Mostre todos os números multiplicados por 2 */

import java.util.Arrays;
import java.util.List;

public class numeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        numeros.forEach(n -> System.out.println(n*2));
    }
    
}
