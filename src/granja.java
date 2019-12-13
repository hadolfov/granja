import entidades.*;

import java.util.ArrayList;
import java.util.Random;

public class granja {
    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Perro perro = new Perro();
        Gato gato = new Gato();
        Gallo gallo = new Gallo();
        ArrayList<ArrayList<Animal>> animales = new ArrayList<ArrayList<Animal>>();
        Random rand = new Random();
        animales.;
        int rand_int1 = rand.nextInt(3);
        switch (rand_int1){
            case 0:
                try{
                    animales.get(vaca.getNumero()).add(vaca);
                } catch (Exception e){

                }
                break;
            case 1:
                try{

                } catch (Exception e){

                }
                animales.get(perro.getNumero()).add(perro);
                break;
            case 2:
                try{

                } catch (Exception e){

                }
                animales.get(gato.getNumero()).add(gato);
                break;
            case 3:
                try{

                } catch (Exception e){

                }
                animales.get(gallo.getNumero()).add(gallo);
                break;
            default:
                break;
        }

    }
}
