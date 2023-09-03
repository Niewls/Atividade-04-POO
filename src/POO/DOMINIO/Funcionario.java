package POO.DOMINIO;

import java.time.LocalDate;

public class Funcionario extends BasePessoa {
    private String contaCorrente;
    private String cracha;
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public Funcionario(int codigo, LocalDate dataInsercao, String usuario, String senha, String telefone, String email,
            String nome, LocalDate dataNascimento, String registro, String contaCorrente, String cracha) {
        super(codigo, dataInsercao, usuario, senha, telefone, email, nome, dataNascimento, registro);
        this.contaCorrente = contaCorrente;
        this.cracha = cracha;
    }
    
}
