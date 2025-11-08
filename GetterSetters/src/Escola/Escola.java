package Escola;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Gabriel");
        aluno.setIdade(27);
        System.out.println("O nome do aluno é "+ aluno.getNome() + ", sua idade é "+ aluno.getIdade());
    }
}