import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void msgErroDados(){
        System.err.println("Dados informados incorretamente! Por favor, informe os dados corretamente.");
    }

    public static void msgErroOpcoes(){
        System.err.println("Por favor, selecione uma das opções válidas.");
    }

    public static int startOptions(){
        Scanner op = new Scanner(System.in); // scanner da opção de entrada
        int opt = -1;

        System.out.println("****************OPÇÕES:****************");
        System.out.println("*  [1] Adicionar Produto              *");
        System.out.println("*  [2] Adicionar Funcionário          *");
        System.out.println("*  [3] Editar Produto                 *");
        System.out.println("*  [4] Editar Funcionário             *");
        System.out.println("*  [5] Remover Produto                *");
        System.out.println("*  [6] Remover Funcionário            *");
        System.out.println("*  [7] Realizar Movimentação          *");
        System.out.println("*  [8] Alterar Status do Produto      *");
        System.out.println("*  [0] Encerrar programa              *");
        System.out.println("***************************************");
        System.out.print("Selecione a opção desejada: ");

        try{
            opt = op.nextInt();
        }
        catch(InputMismatchException error){
            msgErroOpcoes();
            opt = startOptions();
        }

        return opt; // opção selecionada
    }

    public static void main(String[] args) {    

        System.out.println("***************************************");
        System.out.println("*                                     *");
        System.out.println("* SISTEMA DE GERENCIAMENTO DE ESTOQUE *");
        System.out.println("*                                     *");
        System.out.println("***************************************");
        System.out.println();

        int option = startOptions();

        while(option != 0){ // enquanto não for dado o comando de parar o programa
            switch(option){
                case 1: /* adiciona novo produto
                    System.out.println();
                    newColaborador(professores, colaboradores, alunos);
                    System.out.println();
                    option = startOptions(); */
                    break;
                case 2: /* adiciona novo funcionário
                    System.out.println();
                    newProjeto(professores, projetos);
                    System.out.println();
                    option = startOptions(); */
                    break;
                case 3: /* edita produto existente
                    ArrayList<Colaborador> autores = new ArrayList<Colaborador>(); // autores de uma publicacao
                    newProdAcad(colaboradores, autores, professores, alunos);
                    System.out.println();
                    option = startOptions(); */
                    break;
                case 4: /* edita funcionário existente
                    System.out.println();
                    editProjeto(projetos, colaboradores);
                    System.out.println();
                    option = startOptions(); */
                    break;
                case 5: /* remove produto existente
                    System.out.println();
                    Colaborador.queryColaborador(colaboradores);
                    System.out.println();
                    option = startOptions(); */
                    break;
                case 6: /* remove funcionario existente
                    System.out.println();
                    Projeto.queryProjeto(projetos);
                    System.out.println();
                    option = startOptions(); */
                    break;
                case 7: /* realiza uma movimentação de estoque
                    System.out.println();
                    Relatorio relatorio = new Relatorio();
                    relatorio.relatorio();
                    System.out.println();
                    option = startOptions(); */
                    break;
                case 8: /* realiza uma movimentação de estoque
                    System.out.println();
                    Relatorio relatorio = new Relatorio();
                    relatorio.relatorio();
                    System.out.println();
                    option = startOptions(); */
                    break;
            }
        }
    }
}        
