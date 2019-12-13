package entidades;

public class Perro extends Animal{
    public int numero = 1;

    @Override
    public void hablar(){
        System.out.println("Guau");
    }

    public Perro() {
    }
}
