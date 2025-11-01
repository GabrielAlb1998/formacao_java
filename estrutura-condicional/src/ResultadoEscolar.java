import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double media;

        try {
            System.out.print("Qual a média escolar?");
            media = scanner.nextDouble();
                if(media >=7) System.out.println("Aluno aprovado");
                    else if (media == 6) System.out.println("Aluno em recuperação");
                else System.out.println("Aluno reprovado");

        }catch (Exception e){
            System.out.println("Nota invalida");
        }






    }
}