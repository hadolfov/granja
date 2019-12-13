package entidades;

public class Animal {
    protected  int clase;
    protected int numero;
    protected String onomatopeya;
    public void hablar(){
        System.out.println(this.getClass().getSimpleName() + " " + this.numero + " dice " + this.onomatopeya);
    }

    public Animal() {

    }

    public String getOnomatopeya() {
        return onomatopeya;
    }

    public  int getClase() {
        return clase;
    }
}

