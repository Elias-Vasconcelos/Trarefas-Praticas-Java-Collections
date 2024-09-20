import java.io.ByteArrayOutputStream;
import java.util.*;

public class ListaDeAlunos {



    private List<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno ){
        this.listaAlunos.add(aluno);
    }

    public void removerAluno(String nomeAluno){
        Boolean stop = false;
        int current = 0;

        while (!stop){

            current ++;
            Aluno alunoAtual = this.listaAlunos.get(current);

            if(alunoAtual.getNome() == nomeAluno  ){
                this.listaAlunos.remove(current);
                stop = true;
            }
        }
    }

    public void alunoComMaiorNota() {

       Aluno alunoMaiorNota = listaAlunos.get(0);

         for(int i = 0; i < this.listaAlunos.size() ; i++){
             Aluno alunoAtual = this.listaAlunos.get(i);

             if( alunoMaiorNota.getNota() < alunoAtual.getNota()) {
                 alunoMaiorNota = alunoAtual;
             }
         }
        System.out.println("O aluno com a maior nota é " + alunoMaiorNota );

    }

    public void alunoComMenorNota(){
        Aluno alunoMenorNota = listaAlunos.get(0);

        for(int i = 0; i < this.listaAlunos.size() ; i++){
            Aluno alunoAtual = this.listaAlunos.get(i);

            if( alunoMenorNota.getNota() < alunoAtual.getNota()) {
                alunoMenorNota = alunoAtual;
            }
        }
        System.out.println("O aluno com a menor nota é " + alunoMenorNota );
    }

    public void oredenaPorNota(){
        Collections.sort(this.listaAlunos, Comparator.comparing((Aluno::getNota)));

        System.out.println("***** Alunos Rankeados por Nota *****");
        for(int i =0; i < this.listaAlunos.size(); i++){
            Aluno alunoAtual = this.listaAlunos.get(i);
            System.out.println(alunoAtual);
        };
    }

    public void oredenaPorNome(){
        Collections.sort(this.listaAlunos, Comparator.comparing((Aluno::getNome)));

        System.out.println("***** Alunos por oredem alfabética *****");
        for(int i =0; i < this.listaAlunos.size(); i++){
            Aluno alunoAtual = this.listaAlunos.get(i);
            System.out.println(alunoAtual);
        };
    }

    public void getAlunosAprovados(){
        List<Aluno> aprovados = new ArrayList<>();

        for(int i =0; i < this.listaAlunos.size(); i++){
            Aluno alunoAtual = this.listaAlunos.get(i);
            if( alunoAtual.getNota() >= 7){
                aprovados.add(alunoAtual);
            }
        }
        System.out.println("***** Alunos aprovados   *****");
        for(int i =0; i < aprovados.size(); i++){
            Aluno alunoAtual =  aprovados.get(i) ;
            System.out.println(alunoAtual);
        }
        System.out.println(" ");
    }

    public void getAlunosReprovados(){

        List<Aluno> Reprovados = new ArrayList<>();

        for(int i =0; i < this.listaAlunos.size(); i++){
            Aluno alunoAtual = this.listaAlunos.get(i);
            if( alunoAtual.getNota() <= 4){
                Reprovados.add(alunoAtual);
            }
        }

        System.out.println("***** Alunos Reprovados   *****");
        for(int i =0; i < Reprovados.size(); i++){
            Aluno alunoAtual =  Reprovados.get(i) ;
            System.out.println(alunoAtual);
        }
        System.out.println(" ");
    }

    public void getAlunosDeRecuperacao(){

        List<Aluno> recuperacao = new ArrayList<>();

        for(int i =0; i < this.listaAlunos.size(); i++){
            Aluno alunoAtual = this.listaAlunos.get(i);
            if( alunoAtual.getNota() < 7 && alunoAtual.getNota() >= 5 ){
                recuperacao.add(alunoAtual);
            }
        }
        System.out.println("***** Alunos Na Recuperacao *****");
        for(int i =0; i < recuperacao.size(); i++){
            Aluno alunoAtual =  recuperacao.get(i) ;
            System.out.println(alunoAtual);
        }
        System.out.println(" ");
    }

    public void statusAlunos(){
        getAlunosAprovados();
        getAlunosReprovados();
        getAlunosDeRecuperacao();
    }
}
