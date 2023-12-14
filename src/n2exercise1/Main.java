package n2exercise1;

public class Main {
    public static void main(String[] args)
    {
        Telefon telefono = new Telefon("Samsung","Galaxy");
        telefono.trucar("635034510");
        Smartphone movil = new Smartphone();
        movil.fotografiar();
        movil.alarma();
    }
}
