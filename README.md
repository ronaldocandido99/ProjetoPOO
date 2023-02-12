# Sistema para Gerenciamento de Estoque

## Equipe:

    Eduardo Serpa Cavalcante
    Lilian Neves
    Lucas Arthur Ribeiro Mascarenhas
    Matheus Feitosa Ramos
    Ronaldo Cândido dos Santos 
    
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Visão Geral do Sistema

O sistema de gerenciamento de estoque objetiva o gerenciamento de produtos de uma loja de departamento. Essa loja de departamento vende produtos dos tipos: roupas (feminina, masculina e infantil), calçados, artigos de casa, acessórios, eletrônicos e perfumes. 

    (i) identificação;
    (ii) especificação;
    (iii) tamanho;
    (iv) cor;
    (v) marca;
    (vi) preço;
    (vii) tipo
    (viii) categoria
    (ix) fabricante;
    (x) fornecedor;

Cada atividade possui as seguintes informações:

    (i) item;
    (ii) localidade;
    (iii) movimentação;
    (iv) data de entrada;
    (v) data de saída;
    (vi) Quantidade disponível.

## Requisitos Funcionais

    1) Permitir a criação e remoção de informações referentes aos produtos, movimentações e funcionários/responsáveis.
    
    2) Permitir a edição de informações referentes aos produtos, movimentações e funcionários/responsáveis.
    
    3) Permitir a associação de produto a uma localidade do estoque.
    
    4) Permitir a alteração do status:
        • “Em estoque”, “Sem estoque”, “quantidade” etc.
        
    5) Permitir consultas de informações.
    
    6) O sistema deve fornecer um relatório de entrada, saída do produto.
    
    7) O sistema deve permitir o intercâmbio de usuários entre lojas para realização de get.
    
    8) O sistema deve suportar o gerenciamento de pagamento dos produtos. 
    
    9) O sistema deve suportar controle de acesso através de usuário e senha com possibilidade para recuperação de senha.
    
    10) Permitir operações de undo e redo de informações referentes aos produtos, movimentações e funcionários/responsáveis.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Classes

    App
    
        # Funções: 
    
    Funcionarios
    
        # Funções: 
        
        imp_e: Impressão dos Dados de um Funcionario;
    
        add_e: Adição de um Funcionario;
    
        rem_e: Remoção de um Funcionario;
    
        M_Inicial: função de apoio para ed_e;
    
        ed_e: Alterar Detalhes de um Funcionario;

    Movimentacao
    
        # Funções: 
        
        imp_m: Impressão dos Dados de uma Movimentação;
    
        add_m: Adição de uma Movimentação;
    
        CategoriaProduto: função de apoio para add_m e ed_m;
    
        M_Inicial: função de apoio para ed_m;
    
        ed_m: Alterar Detalhes de uma Movimentação;

    Produto
    
        # Funções: 

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
