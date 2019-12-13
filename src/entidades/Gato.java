package entidades;

public class Gato extends Animal{
    private int numero = 2;

    @Override
    public void hablar() {
        System.out.println("Miau");
    }

    public Gato() {
    }
}
