/*Crie uma lista de palavras e: mostre o tamanho de cada palavra */
import java.util.Arrays;
import java.util.List;

public class Map2 {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Paz", "Alegria", "Felicidade", "Sabedoria");

        palavras.stream()
                .map(p -> p.length()) 
                .forEach(System.out::println); 
    }
}