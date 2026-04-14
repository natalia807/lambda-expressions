import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Mouse", 50),
                new Produto("Teclado", 120),
                new Produto("Monitor", 900),
                new Produto("Cabo USB", 30)
        );

        produtos.stream()
                .filter(p -> p.getPreco() > 100) 
                .map(Produto::getNome)          
                .forEach(System.out::println);  
        
        List<Aluno> alunos = Arrays.asList(
            new Aluno("Natalia", 7.7),
            new Aluno("Lucas", 6),
            new Aluno("Ana",8)
        );

       System.out.println("Aprovados:");
        alunos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(Aluno::getNome)
                .forEach(System.out::println);

        
        double media = alunos.stream()
                .mapToDouble(Aluno::getNota)
                .average()
                .orElse(0.0);

        System.out.println("Média da turma: " + media);
    }
}