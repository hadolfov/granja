package entidades;

abstract class animal {
    //private   int numero;
    abstract void hablar();
}

class vaca extends animal{
    @Override
    void hablar() {
        System.out.println("Muu");
    }
}

class perro extends animal{
    @Override
    void hablar(){
        System.out.println("Guau");
    }
}

class gato extends animal{
    @Override
    void hablar() {
        System.out.println("Miau");
    }
}

class gallo extends animal{
    @Override
    void hablar(){
        System.out.println("Kikiriki");
    }
}