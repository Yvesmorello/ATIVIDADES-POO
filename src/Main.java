import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João",LocalDate.of(1998, 8, 20),24);

        System.out.println();
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Idade: " + pessoa.getIdade());

    }
}