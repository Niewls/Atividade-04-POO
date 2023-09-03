package POO.DOMINIO;

import java.time.LocalDate;

public class Passageiro extends BasePessoa{
    private String numeroCartao;
    private String documento;
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Passageiro(int codigo, LocalDate dataInsercao, String usuario, String senha, String telefone, String email,
            String nome, LocalDate dataNascimento, String registro, String numeroCartao, String documento) {
        super(codigo, dataInsercao, usuario, senha, telefone, email, nome, dataNascimento, registro);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }
    
    
    
    
}
