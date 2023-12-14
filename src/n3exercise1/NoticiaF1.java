package n3exercise1;

public class NoticiaF1 extends Noticia{
    String escuderia;

    public NoticiaF1(String escuderia)//Constructor
    {
        this.escuderia = escuderia;
        System.out.println("Escuderia: "+escuderia);
    }
    public void calcularPrecioNoticia()
    {
        double precioInicial = 100;
        if(escuderia == "Ferrari" || escuderia == "Mercedes"){precioInicial = precioInicial + 50;}
        System.out.println("El precio total es: "+precioInicial);
    }
    public void calcularPuntuacionNoticia()
    {
        int puntaje = 4;
        if(escuderia == "Ferrari"||escuderia=="Mercedes"){puntaje = puntaje + 2;}

        System.out.println("Puntaje final: "+puntaje+"\n");
    }
}
