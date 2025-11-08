import java.util.Scanner;
public class CadastroAlunos {
    public static void main(String[] args) {
       Aluno aluno = new Aluno();
       Scanner sc =new Scanner(System.in);



       System.out.println("Nome do aluno:");
       while(!sc.hasNext()) {
           System.err.println("Digite um nome");
           sc.hasNext();
       }
       aluno.nome = sc.next();


       System.out.println( "O nome do aluno é " + aluno.nome );
       }
}