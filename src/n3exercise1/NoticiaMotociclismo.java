package n3exercise1;

public class NoticiaMotociclismo extends Noticia{
    String equipo;

    public NoticiaMotociclismo(String equipo)
    {
        this.equipo = equipo;
        System.out.println("Equipo: "+ equipo);
    }
    public void calcularPrecioNoticia()
    {
        double precioInicial = 100;
        if(equipo == "Honda" || equipo == "Yamaha"){precioInicial = precioInicial + 50;}
        System.out.println("El precio final es: "+precioInicial);
    }
    public void calcularPuntuacionNoticia()
    {
        int puntaje = 4;
        if(equipo=="Honda"||equipo=="Yamaha"){puntaje = puntaje + 3;}

        System.out.println("Puntaje final: "+puntaje+"\n");
    }

}
