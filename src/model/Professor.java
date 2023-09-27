package model;

public class Professor extends Funcionario{
    private String formacao;
    private String tipoVinculo;

    public Professor(String cpf, String nome, int matricula, String endereco, String formacao, String tipoVinculo, double salario) {
        super(cpf, nome, matricula, endereco, salario);
        this.formacao = formacao;
        this.tipoVinculo = tipoVinculo;
    }

    @Override
    public double getSalario(){
        double gratificacao;

        if(formacao.equals("Graduação")){
            gratificacao = 0;
        }else if(formacao.equals("Especialização")){
            gratificacao = 500;
        }else if(formacao.equals("Mestrado")){
            gratificacao = 1000;
        }else if(formacao.equals("Doutorado")){
            gratificacao = 2000;
        }else{
            gratificacao = 0;
        }

        return salario+gratificacao;

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
