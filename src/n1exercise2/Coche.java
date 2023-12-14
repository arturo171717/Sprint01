package n1exercise2;

public class Coche {
    static final String marca = "Mazda";
    //me obliga a inicializar
    static String modelo;
    //no necesita inicializar
    final int potencia;


    public Coche(String modelo, int potencia)
    {

        this.modelo = modelo;
        this.potencia = potencia;
        System.out.println("El coche marca "+ marca + " modelo "+ modelo +" y potencia "+ potencia );


    }

    static void frenar(){
        System.out.println("El vehiculo esta frenando");
    }
    public void acelerar(){
        System.out.println("El vehiculo esta acelarando");
    }

}
