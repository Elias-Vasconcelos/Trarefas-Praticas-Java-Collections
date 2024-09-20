public class Aluno {

    private String nome;
    private Double nota;

    public Aluno(String nome,Double nota) {
        this.nome = nome;
        this.nota = nota;
    }


    public Double getNota() {
        return nota;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
