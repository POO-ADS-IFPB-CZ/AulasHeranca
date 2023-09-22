public class Professor extends Pessoa{
    private String formacao;
    private String tipoVinculo;
    private double salario;

    public Professor(String cpf, String nome, int matricula, String endereco, String formacao, String tipoVinculo, double salario) {
        super(cpf, nome, matricula, endereco);
        this.formacao = formacao;
        this.tipoVinculo = tipoVinculo;
        this.salario = salario;
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
