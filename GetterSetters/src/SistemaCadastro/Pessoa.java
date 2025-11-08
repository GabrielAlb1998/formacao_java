package SistemaCadastro;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;

    //Construtor
    public Pessoa(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf(){
      return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
