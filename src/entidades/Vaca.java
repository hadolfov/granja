package entidades;

public class Vaca extends Animal{
    private int numero = 0;

    @Override
    public void hablar() {
        System.out.println("Muu");
    }

    public Vaca() {
    }
}
