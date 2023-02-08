/*1) Permitir a criação e remoção de informações referentes aos produtos, movimentações e funcionários/responsáveis;
2) Permitir a edição de informações referentes aos produtos, movimentações e funcionários/responsáveis;
3) Permitir a associação de produto a uma localidade do estoque;
4) Permitir a alteração do status
• “Em estoque”, “Sem estoque”, “quantidade” etc.*/

import java.util.Scanner;

public class Funcionarios{

    private String nome;
    private long cpf;
    private int id;
    private String email;
    private long telefone;

    Scanner input = new Scanner(System.in);

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setcpf(long cpf) {
        this.cpf = cpf;
    }

    public long getcpf() {
        return cpf;
    }

    public void imp_e() {

        if (getId() != -1) {
            System.out.println("Identificação: " + getId());
            System.out.println("Nome: " + getNome());
            System.out.println("Email: " + getEmail());
            System.out.println("Telefone: " + getTelefone());
            System.out.println("CPF: " + getcpf());  
        } else {
            System.out.println("Empregado não existente");
        }
        System.out.println();
    }

    public void add_e(int ficha) {// Adição de um empregado

        long aux1;
        String aux2;

        setId(ficha);
        System.out.println("Informe o Nome Completo: ");
        aux2 = input.nextLine();
        setNome(aux2);
        System.out.println("Informe o Email: ");
        aux2 = input.nextLine();
        setEmail(aux2);
        System.out.println("Informe o Telefone(somente numeros): ");
        aux1 = input.nextLong();
        setTelefone(aux1);
        input.nextLine();
        System.out.println("Informe o Endereço: ");
        aux2 = input.nextLine();
        setEndereco(aux2);
        System.out.println("Informe o CPF: ");
        aux2 = input.nextLine();
        setcpf(aux2);
        System.out.println();
    }

    public void rem_e() {// Remoção de um empregado

        int aux1 = -1;
        String aux2 = null;

        setId(aux1);
        setNome(aux2);
        setEmail(aux2);
        setTelefone(aux1);
        setcpfaux1);
    }

    public void M_Inicial() {// função de apoio

        System.out.println("Informe o campo que deseja alterar:");
        System.out.println("Nome Completo(1);\n" + "Email(2);" + "Telefone(3);" + "CPF(4);\n"
                + "Sair(5).");
    }

    public void ed_e() {// Alterar detalhes de um empregado

        int opcao = 1;
        long aux1;
        String aux2;
        double aux3;

        while (opcao != 5) {

            M_Inicial();
            opcao = input.nextInt();
            switch (opcao) {
            case 1:
                System.out.println("Informe o Novo Nome Completo: ");
                aux2 = input.nextLine();
                setNome(aux2);
                System.out.println();
                break;
            case 2:
                System.out.println("Informe o Novo Email: ");
                aux2 = input.nextLine();
                setEmail(aux2);
                System.out.println();
                break;
            case 3:
                System.out.println("Informe o Novo Telefone(somente numeros): ");
                aux1 = input.nextLong();
                setTelefone(aux1);
                input.nextLine();
                System.out.println();
                break;
            case 4:
                System.out.println("Informe o Novo CPF(somente numeros): ");
                aux1 = input.nextLong();
                setcpf(aux1);
                input.nextLine();
                System.out.println();
                break;
            case 5:
                System.out.println("Modificações Salvas!!");
                System.out.println();
                break;
            default:
                System.out.println("Opção Invalida!!!");
                System.out.println("Digite Novamente");
                System.out.println();
            }
        }
    }

}
