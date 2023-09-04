package POO.DOMINIO;

import java.time.LocalDate;

public abstract class BasePessoa extends BaseLogin{
    protected String nome;
    protected LocalDate dataNascimento;
    protected String registro;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public BasePessoa(int codigo, LocalDate dataInsercao, String usuario, String senha, String telefone, String email,
            String nome, LocalDate dataNascimento, String registro) {
        super(codigo, dataInsercao, usuario, senha, telefone, email);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.registro = registro;
    }
}
