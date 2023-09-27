package model;

public abstract class Funcionario extends Pessoa{

    protected double salario;

    public Funcionario(String cpf, String nome, int matricula, String endereco,
                       double salario){
        super(cpf, nome, matricula, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
