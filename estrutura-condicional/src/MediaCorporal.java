import java.util.Scanner;
public class MediaCorporal {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Qual tamanho da roupa?");
        String tamanho = scan.next().toUpperCase();

           switch (tamanho){
               case "P":
                   System.out.print("Roupa pequena");
                   break;
               case "M":
                   System.out.print("Roupa media");
                   break;
               case "G":
                   System.out.print("Roupa grande");
                   break;
               default:
                   System.out.print("Tamanho não cadastrado");
           }

           scan.close();
        }

}
