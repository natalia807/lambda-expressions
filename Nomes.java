/*Crie uma lista de nomes e: Imprima todos usando lambda */

import java.util.Arrays;
import java.util.List;

public class Nomes {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Maria", "Julia", "Pedro");
         nomes.forEach(n -> System.out.println(n));
    }
}