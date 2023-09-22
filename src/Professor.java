public class Professor {

    private String nome;
    private String cpf;
    private int matricula;
    private String endereco;
    private String formacao;
    private String tipoVinculo;
    private double salario;

    public Professor(String nome, String cpf, int matricula, String endereco, String formacao, String tipoVinculo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.endereco = endereco;
        this.formacao = formacao;
        this.tipoVinculo = tipoVinculo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(String tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
