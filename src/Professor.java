public class Professor extends Funcionario{
    private String formacao;
    private String tipoVinculo;

    public Professor(String cpf, String nome, int matricula, String endereco, String formacao, String tipoVinculo, double salario) {
        super(cpf, nome, matricula, endereco, salario);
        this.formacao = formacao;
        this.tipoVinculo = tipoVinculo;
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

}
