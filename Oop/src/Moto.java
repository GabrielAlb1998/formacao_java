public class Moto extends Veiculo{

    @Override
    public void ligar() {
        conferindoCombustivel();

        System.out.println("Moto ligada");
    }

    private void conferindoCombustivel(){
        System.out.println("Conferindo combustivel");
    }
}
