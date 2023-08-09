import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private int idade;

    public Pessoa(String nome, LocalDate dataNascimento, int idade){
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }

    public String getNome(){
       return nome;
    }
   public void setNome(String nome){
        this.nome = nome;
   }

    public int getIdade(){
        return idade;
    }
   public void setIdade(){
        this.idade = 50;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
}
