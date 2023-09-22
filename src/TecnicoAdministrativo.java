public class TecnicoAdministrativo extends Pessoa {
    private double salario;
    private String setor;
    private String cargo;

    public TecnicoAdministrativo(String cpf, String nome, int matricula, String endereco, double salario, String setor, String cargo) {
        super(cpf, nome, matricula, endereco);
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
