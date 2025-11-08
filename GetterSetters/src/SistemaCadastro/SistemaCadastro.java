package SistemaCadastro;

public class SistemaCadastro {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Gabriel","11523996404");
        pessoa.setIdade(27);
        pessoa.setEndereco("Rua maria");

        System.out.println("Seu nome é "+ pessoa.getNome());
    }
}
