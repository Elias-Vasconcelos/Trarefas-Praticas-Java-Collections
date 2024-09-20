import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <Case> void main(String[] args) {
        Boolean interacao = true;
        Scanner sacan = new Scanner(System.in);

        Aluno joao = new Aluno( "João", 7.0 );
        Aluno pedro = new Aluno( "pedro", 4.0 );
        Aluno guilerme = new Aluno( "guilerme", 4.0 );
        Aluno julia = new Aluno( "julia", 10.0 );
        Aluno ana = new Aluno( "ana", 8.0 );

        ListaDeAlunos listaTest  = new ListaDeAlunos();
        listaTest.adicionarAluno(joao);
        listaTest.adicionarAluno(pedro);
        listaTest.adicionarAluno(guilerme);
        listaTest.adicionarAluno(julia);
        listaTest.adicionarAluno(ana);

        System.out.println("Ola! Seja muito bem vindo ao sistema de consuta de alunos!");
        while(interacao) {
            String acao = "";
            int Opcao = 0;

            System.out.println("Oque voce deseja realizar? [ alteraçao ] OU [ consuta ] ");
            acao = sacan.next();
            if(acao.equals("consuta")){
                System.out.println("Selecione a forma de consutar os alunos?");
                System.out.println("[1] Aluno com maior Nota , [2] Aluno com Menor nota, [3] Rank de alunos por nota ");
                System.out.println("[4] Lista de alunos em oredem  alfabética , [5] Status Gerais dos alunos ");
                Opcao = sacan.nextInt();

                switch (Opcao) {
                    case 1:
                          listaTest.alunoComMaiorNota();
                    break;

                    case 2 :
                        listaTest.alunoComMenorNota();
                    break;

                    case 3 :
                       listaTest.oredenaPorNota();
                       break;
                    case  4:
                        listaTest.oredenaPorNome();
                        break;

                    case 5:
                        listaTest.statusAlunos();
                }


                System.out.println("Deseja continuar? sim ou nao ");
                acao = sacan.next();
                if( acao.equals("nao")){
                    interacao = false;
                }

            }
            if(acao.equals("alteraçao")){
                System.out.println("[1] Adicionar um novo aluno , [2] Remover um aluno");
                Opcao = sacan.nextInt();

                Boolean alterando = true;
                String resposta = "";

                switch (Opcao){
                    case 1:
                        while (alterando) {
                            System.out.println("Nome do aluno");
                            String novoNome = sacan.next();
                            System.out.println("Nota atual do aluno");
                            Double novaNota = sacan.nextDouble();

                            listaTest.adicionarAluno( new Aluno(novoNome,novaNota));

                            System.out.println("Cadastro realizado! deseja cadastrar mais algum aluno ?");
                            resposta = sacan.next();
                            if( resposta.equals("nao")){
                                  alterando = false;
                            }
                        }
                        break;

                    case 2:
                        while (alterando) {
                            System.out.println("Digite o nome do aluno que voce deseja remover");
                            String novoNome = sacan.next();
                            listaTest.removerAluno(novoNome);
                            System.out.println("Deseja remover mais algum aluno ?");
                            resposta = sacan.next();
                            if( resposta.equals("nao")){
                                alterando = false;
                            }
                        }
                        break;
                }
            }

            System.out.println("Deseja realizar alguma outra acao no programa? sim ou nao  ");
            acao = sacan.next();
            if (acao.equals("nao")){
                interacao = false;
            }
        }


    }
}