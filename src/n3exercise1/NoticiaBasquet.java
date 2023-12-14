package n3exercise1;

public class NoticiaBasquet extends Noticia{
    String competicion;
    String club;

    public NoticiaBasquet(String competicion, String club) //Constructor
    {
        this.competicion = competicion;
        this.club = club;
        System.out.println("Competicion: "+competicion+" club: "+club);

    }
    public void calcularPrecioNoticia()
    {
        double precioInicial = 250;
        if(competicion == "Euroliga"){precioInicial = precioInicial + 75;}
        if(club == "Barça" || club == "Madrid"){precioInicial = precioInicial + 75;}
        System.out.println("El precio total es: "+precioInicial);
    }

    public void calcularPuntuacionNoticia()
    {
        int puntaje = 4;
        if(competicion== "Euroliga"){puntaje = puntaje + 3;}
        else if(competicion == "ACB"){puntaje = puntaje + 2;}
        if(club == "Barça" || club == "Madrid"){puntaje = puntaje + 1;}

        System.out.println("Puntaje final: "+puntaje+"\n");
    }
}
