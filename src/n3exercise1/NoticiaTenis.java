package n3exercise1;

public class NoticiaTenis extends Noticia {
    String competicion;
    String tenista;

    public NoticiaTenis(String competicion, String tenista)
    {
        this.competicion = competicion;
        this.tenista = tenista;
        System.out.println("Competicion: "+competicion+" Tenista: "+tenista);

    }
    public void calcularPrecioNoticia()
    {
        double precioInicial= 150;
        if(tenista == "Federer"||tenista == "Nadal" || tenista == "Djokovic"){precioInicial = precioInicial + 100;}
        System.out.println("El precio total es: "+precioInicial);
    }
    public void calcularPuntuacionNoticia()
    {
        int puntaje = 4;
        if(tenista == "Federer"||tenista =="Nadal"||tenista=="Djokovic"){puntaje = puntaje + 3;}

        System.out.println("Puntaje final: "+puntaje+"\n");
    }
}
