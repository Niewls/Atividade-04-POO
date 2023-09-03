package POO.DOMINIO;

import java.time.LocalDate;

public abstract class BaseLogin extends BaseDadosComuns{
    protected String usuario;
    protected String senha;
    protected String telefone;
    protected String email;
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public BaseLogin(int codigo, LocalDate dataInsercao, String usuario, String senha, String telefone, String email) {
        super(codigo, dataInsercao);
        this.usuario = usuario;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
    }
    
}
