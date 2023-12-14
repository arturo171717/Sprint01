package n2exercise1;

public class Telefon {
    String marca;
    String modelo;

    public Telefon(String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
    }
    public Telefon(){};

    public void trucar(String numero)
    {
        System.out.println("Se esta llamando al numero "+ numero);
    }
    public interface camara
    {
        void fotografiar();
    }
    public interface reloj
    {
        void alarma();
    }
}
