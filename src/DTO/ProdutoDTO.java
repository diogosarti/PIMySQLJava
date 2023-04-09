package DTO;

public class ProdutoDTO {
    private int idPruduto,qtdeEstoqueProduto, idFornecedorProduto;
    private String nomeProduto;
    private double precoProduto;

    public ProdutoDTO() {
    }

    public ProdutoDTO(String nomeProduto, double precoProduto, int qtdeEstoqueProduto) {
        this.qtdeEstoqueProduto = qtdeEstoqueProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public int getIdPruduto() {
        return idPruduto;
    }

    public void setIdPruduto(int idPruduto) {
        this.idPruduto = idPruduto;
    }

    public int getQtdeEstoqueProduto() {
        return qtdeEstoqueProduto;
    }

    public void setQtdeEstoqueProduto(int qtdeEstoqueProduto) {
        this.qtdeEstoqueProduto = qtdeEstoqueProduto;
    }

    public int getIdFornecedorProduto() {
        return idFornecedorProduto;
    }

    public void setIdFornecedorProduto(int idFornecedorProduto) {
        this.idFornecedorProduto = idFornecedorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
  
    
    
}
