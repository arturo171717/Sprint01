package n3exercise1;

public class Noticia {
    String titular;
    String texto = "";
    int puntuacion;
    double precio;

    public Noticia(String titular, String texto, int puntuacion, double precio)
    {
        this.titular = titular;
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.precio = precio;
    }
    public Noticia()
    {

    }
    /*public void calcularPrecioNoticia()
    {
        //this.deporte = deporte;
       double precioInicial = 300;
       //this.competicion = competicion;
        //this.equipo = equipo;
        //this.jugador = jugador;

    }*/

}
