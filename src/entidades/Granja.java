package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Granja {
    List<Animal>[] corral = new List[4];

    Animal vaca  = new Vaca(0);
    Animal perro = new Perro(0);
    Animal gato  = new Gato(0);
    Animal gallo = new Gallo(0);

    public void hacerBulla(){
        if (corral[0].size() > 0) {
            corral[vaca.getClase()].get(corral[vaca.getClase()].size()-1).hablar();
        } else System.out.println("No hay vacas.");
        if (corral[1].size() > 0) {
            corral[perro.getClase()].get(corral[perro.getClase()].size()-1).hablar();
        } else System.out.println("No hay perros.");
        if (corral[2].size() > 0) {
            corral[gato.getClase()].get(corral[gato.getClase()].size()-1).hablar();
        } else System.out.println("No hay Gatos.");
        if (corral[3].size() > 0) {
            corral[gallo.getClase()].get(corral[gallo.getClase()].size()-1).hablar();
        } else System.out.println("No hay Gallos");
    }

    public void nuevoAnimal(){

        List<Animal> vacas  = new ArrayList<>();
        List<Animal> perros = new ArrayList<>();
        List<Animal> gatos  = new ArrayList<>();
        List<Animal> gallos = new ArrayList<>();

        corral[0] = vacas;
        corral[1] = perros;
        corral[2] = gatos;
        corral[3] = gallos;

        Random rand = new Random();
        int rand_int1 = rand.nextInt(4);
        switch (rand_int1){
            case 0:
                corral[vaca.getClase()].add(new Vaca(corral[vaca.getClase()].size()+1));
                break;
            case 1:
                corral[perro.getClase()].add(new Perro(corral[perro.getClase()].size()+1));
                break;
            case 2:
                corral[gato.getClase()].add(new Gato(corral[gato.getClase()].size()+1));
                break;
            case 3:
                corral[gallo.getClase()].add(new Gallo(corral[gallo.getClase()].size()+1));
                break;
            default:
                break;
        }
    }
}
