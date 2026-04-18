import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainProduto2 {
    public static void main(String[] args) {
          List<Produto2> produtos = Arrays.asList(
                new Produto2("Mouse", 50),
                new Produto2("Teclado", 120),
                new Produto2("Monitor", 900),
                new Produto2("Cabo USB", 30)
        );

        produtos.stream()
                .sorted(Comparator.comparing(Produto2::getPreco).reversed()) // maior para menor
                .forEach(p -> System.out.println(p.getNome() + " - " + p.getPreco()));
    }
    
}
