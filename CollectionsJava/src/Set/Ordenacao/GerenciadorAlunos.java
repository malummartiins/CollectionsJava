package Set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matrícula não encontrada!");
        }

    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

//TESTANDO

public static void main(String[] args) {
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    // Adicionando alunos ao gerenciador
    gerenciadorAlunos.adicionarAluno("Gina", 123456L, 7.5);
    gerenciadorAlunos.adicionarAluno("Fred", 123457L, 9.0);
    gerenciadorAlunos.adicionarAluno("Jorge", 123458L, 5.0);
    gerenciadorAlunos.adicionarAluno("Carlinhos", 123459L, 6.8);

    // Exibindo todos os alunos no gerenciador
    System.out.println("Alunos no gerenciador:");
    System.out.println(gerenciadorAlunos.alunoSet);

    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
    gerenciadorAlunos.removerAluno(000L);
    gerenciadorAlunos.removerAluno(123457L);
    System.out.println(gerenciadorAlunos.alunoSet);

    // Exibindo alunos ordenados por nome
    gerenciadorAlunos.exibirAlunosPorNome();

    // Exibindo alunos ordenados por nota
    gerenciadorAlunos.exibirAlunosPorNota();
  }

}

