package entidades;

public abstract class Animal {
    private int numero;
    abstract public void hablar();

    public Animal() {
    }

    public int getNumero() {
        return numero;
    }
}

