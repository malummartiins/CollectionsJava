package Set.Ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Long matricula;
    private double media;

    
    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }


    public String getNome() {
        return nome;
    }


    public Long getMatricula() {
        return matricula;
    }


    public double getMedia() {
        return media;
    }


    @Override
    public String toString() {
        return "Aluno [nome= " + nome + ", matricula=" + matricula + ", media=" + media + "]";
    }


    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }   
}
class ComparatorNota implements Comparator<Aluno> {
  @Override
  public int compare(Aluno o1, Aluno o2) {
    return Double.compare(o1.getMedia(), o2.getMedia());
  }
}
