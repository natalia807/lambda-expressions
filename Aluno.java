/*Crie uma lista de alunos: nome, nota
Filtrar aprovados (nota >= 7)
Mostrar nomes
Calcular média da turma*/
public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
    
}
