import entidades.*;

import java.awt.event.KeyEvent;

public class granja {

    public static void main(String[] args) throws InterruptedException {
        Granja G = new Granja();
        do {
            G.nuevoAnimal();
            G.hacerBulla();
            System.out.println("---------");
            Thread.sleep(500);
        } while (1 == 1);
    }
}
