import java.util.Scanner;

public class Produto{
    public String nome;
    public String tamanho;
    public String cor;
    public String marca;
    public int preco;
    public String tipo;
    public String categoria;
    public String fabricante;
    public String fornecedor;

    public Produto(String nome, String tamanho, String cor, String marca, int preco, String tipo, String categoria, String fabricante, String fornecedor){
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.fornecedor = fornecedor;
    }

    public String printProduto(){
        return "Nome: " + this.nome +
        "\nTamanho: " + this.tamanho +
        "\nCor: " + this.cor +
        "\nMarca: " + this.marca +
        "\nPreco: " + this.preco +
        "\nTipo: " + this.tipo +
        "\nCategoria: " + this.categoria +
        "\nFabricante: " + this.fabricante +
        "\nFornecedor: " + this.fornecedor +
    }
}
