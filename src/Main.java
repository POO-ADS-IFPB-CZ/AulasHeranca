public class Main {
    public static void main(String[] args) {

        Professor professora = new Professor("111.111.111-01",
            "Maria", 123456, "Rua A, 30 ,Cajazeiras",
            "Mestrado", "Efetivo", 2000);

        TecnicoAdministrativo tecnico = new TecnicoAdministrativo(
                "222.222.222-02", "João", 654321,
                "Rua C, 30, Marizópolis", 2000, "Biblioteca",
                "Coordenador");

        System.out.println(professora.getSalario());

        System.out.println(tecnico.getSalario());

    }
}