package n3exercise1;

public class NoticiaFutbol extends Noticia {
    String competicion;
    String club;
    String jugador;

    public NoticiaFutbol(String competicion, String club, String jugador) //Constructor
    {
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
        System.out.println("Competicion: " + competicion + " Club: " + club + " Jugador: "+ jugador);
    }

   // String competicion, String club, String jugador
    public void calcularPrecioNoticia()
    {
        double precioInicial = 300;
        this.competicion = competicion;
        if(competicion == "Liga de Campeones"){precioInicial = precioInicial + 100;}
        else { precioInicial = precioInicial;}


        this.club = club;
        if(club == "Barça" || club == "Madrid"){precioInicial = precioInicial + 100;}
        else {precioInicial = precioInicial;}

        this.jugador = jugador;
        if(jugador == "Ferran Torres" || jugador == "Benzema"){precioInicial = precioInicial + 50;}
        else{precioInicial = precioInicial;}

        System.out.println("El precio total es: " + precioInicial);

    }
    public void calcularPuntuacionNoticia()
    {
        int puntaje = 5;
        if(competicion == "Liga de Campeones"){puntaje = puntaje + 3;}
        else if(competicion == "Liga"){puntaje = puntaje + 2;}
        if(club == "Barça" || club == "Madrid"){puntaje = puntaje + 1;}
        if(jugador == "Ferran Torres" || jugador == "Benzema"){puntaje = puntaje + 1;}

        System.out.println("Puntaje Final: "+ puntaje+"\n");
    }

}
