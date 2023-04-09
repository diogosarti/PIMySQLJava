package DTO;

public class FornecedorDTO {
    private int idFornecedor;
    private String nomeForncedor;
    private String enderceoForncedor;

    public FornecedorDTO() {
    }

    public FornecedorDTO(int idFornecedor, String nomeForncedor, String enderceoForncedor) {
        this.idFornecedor = idFornecedor;
        this.nomeForncedor = nomeForncedor;
        this.enderceoForncedor = enderceoForncedor;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeForncedor() {
        return nomeForncedor;
    }

    public void setNomeForncedor(String nomeForncedor) {
        this.nomeForncedor = nomeForncedor;
    }

    public String getEnderceoForncedor() {
        return enderceoForncedor;
    }

    public void setEnderceoForncedor(String enderceoForncedor) {
        this.enderceoForncedor = enderceoForncedor;
    }
    
    
}
