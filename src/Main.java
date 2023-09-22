public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("111.111.111-01", "João",
                123456, "Rua A, 30, Cajazeiras",
                "ADS", 3);
        Professor professora = new Professor("222.222.222-02",
            "Maria", 654321, "Rua B, 50, Cajazeiras",
                "ADS", "Efetivo", 5000);
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo(
                "333.333.333-03", "Pedro", 96352,
                "Rua C, 100, Marizópolis", 3000,
                "Biblioteca", "Bibliotecario");

        aluno.setCpf("666.666.666-06");
        System.out.println(aluno.getCpf());
        System.out.println(aluno.getCurso());



    }
}