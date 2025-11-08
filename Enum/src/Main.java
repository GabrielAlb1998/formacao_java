//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for(EstadosBrasileiros e:EstadosBrasileiros.values()){
          System.out.println("Estado: "+ e.getEstado() + " Sigla: " + e.getSigla());
      }
    }
}