import java.util.Scanner;

public class Movimentacao{

    private String dataMovimentacao;//falta os tratamentos pra o tipo data
    private String Destino;
    private String Origem;
    private int idProduto;
    private int tipoProduto;//falta fazer os tratamentos pro tipo de produto
    private int idResponsavel;
    private int idMovimentacao;

    Scanner input = new Scanner(System.in);

    public void setIdMovimentacao(int idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public int getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdResponsavel(int idResponsavel){
        this.idResponsavel = idResponsavel;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setTipoProduto(int tipoProduto){
        this.tipoProduto = tipoProduto;
    }

    public int gettTipoProduto() {
        return tipoProduto);
    }

    public void setDestino(String Destino){
        this.Destino = Destino;
    }

    public String getDestino() {
        return Destino;
    }

    public void setOrigem(String Origem){
        this.Origem = Origem;
    }

    public String getOrigem() {
        return Origem;
    }

    public void setDataMovimentacao(String dataMovimentacao){
        this.dataMovimentacao =  dataMovimentacao;
    }

    public String getDataMovimentacao() {
        return  dataMovimentacao;
    }

    public void imp_m() {

        if (getId() != -1) {
            System.out.println("Data da Movimentação: " + getDataMovimentacao());
            System.out.println("Produto: " + gettTipoProduto(());
            System.out.println("Categoria do Produto: " +  gettTipoProduto() );
            System.out.println("Responsavel da Movimentação: " + getIdResponsavel());
            System.out.println("Destino da Movimentação: " + getDestino());  
        } else {
            System.out.println("Empregado não existente");
        }
        System.out.println();
    }

    public void add_m(int ficha) {// Adição de um empregado

        int aux1;
        String aux2;

        setIdMovimentacao(ficha);
        System.out.println("Informe a Identificação do Responsavel: ");
        aux1 = input.nextInt();
        setIdResponsavel(aux1);
        input.nextLine();
        System.out.println("Informe a Identificação do Produto:  ");
        aux1 = input.nextInt();
        setIdProduto(aux1);
        input.nextLine();
        System.out.println("Informe a Categoria do Produto(somente numeros): ");
        aux1 = input.nextInt();
        setTipoProduto(aux1);
        input.nextLine();
        System.out.println("Informe O Destino do Produto: ");
        aux2 = input.nextLine();
        setDestino(aux2);
        input.nextLine();
        System.out.println("Informe a Origem do Produto:");
        aux2 = input.nextLine();
        setOrigem(aux2);
        input.nextLine();
        System.out.println("Informe a Data da Movimentação do Produto:(hh:mm DD/MM/YYYY)");
        aux2 = input.nextLine();
        setDataMovimentacao(aux2);
        input.nextLine();
        System.out.println();
    }

    public void M_Inicial() {// função de apoio

        System.out.println("Informe o campo que deseja alterar:");
        System.out.println("Identificação do Responsavel(1);\n" + "Identificação do Produto(2);" + "Categoria do Produto(3);\n" 
        + "Destino do Produto(4);" + "Origem do Produto(5);\n" + "Data da Movimentação do Produto(6);" + "Sair(7).");
    }

    public void ed_e() {// Alterar detalhes de um empregado

        int opcao = 1;
        long aux1;
        String aux2;
        double aux3;

        while (opcao != 7) {

            M_Inicial();
            opcao = input.nextInt();
            switch (opcao) {
            case 1:
                System.out.println("Informe a Nova Identificação do Responsavel: ");
                aux1 = input.nextInt();
                setIdResponsavel(aux1);
                input.nextLine();
                System.out.println();
                break;
            case 2:
                System.out.println("Informe a Nova Identificação do Produto:  ");
                aux1 = input.nextInt();
                setIdProduto(aux1);
                input.nextLine();
                System.out.println();
                break;
            case 3:
                System.out.println("Informe a Nova Categoria do Produto(somente numeros): ");
                aux1 = input.nextLong();
                setTipoProduto(aux1);
                input.nextLine();
                System.out.println();
                break;
            case 4:
                System.out.println("Informe O Novo Destino do Produto: ");
                aux2 = input.nextLine();
                setDestino(aux2);
                input.nextLine();
                System.out.println();
                break;
            case 5:
                System.out.println("Informe a Nova Origem do Produto:");
                aux2 = input.nextLine();
                setOrigem(aux2);
                input.nextLine();
                System.out.println();
                break;
            case 6:
                System.out.println("Informe a Nova Data da Movimentação do Produto:(hh:mm DD/MM/YYYY)");
                aux2 = input.nextLine();
                setDataMovimentacao(aux2);
                input.nextLine();
                System.out.println();
                break;   
            case 7:
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
