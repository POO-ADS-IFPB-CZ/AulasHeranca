public class TecnicoAdministrativo extends Funcionario {
    private String setor;
    private String cargo;

    public TecnicoAdministrativo(String cpf, String nome, int matricula, String endereco, double salario, String setor, String cargo) {
        super(cpf, nome, matricula, endereco, salario);
        this.setor = setor;
        this.cargo = cargo;
    }

    @Override
    public double getSalario(){
        if(cargo.equals("Coordenador")){
            return super.getSalario()+1000;
        }else{
            return super.getSalario();
        }
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
