package n3exercise1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Redactor> redactoresArray = new ArrayList();

        NoticiaFutbol noticiaFutbol = new NoticiaFutbol("Liga de Campeones", "Madrid", "Benzema");
        noticiaFutbol.calcularPrecioNoticia();
        noticiaFutbol.calcularPuntuacionNoticia();

        NoticiaBasquet noticiaBasquet = new NoticiaBasquet("Euroligas", "Barças");
        noticiaBasquet.calcularPrecioNoticia();
        noticiaBasquet.calcularPuntuacionNoticia();

        NoticiaTenis noticiaTenis = new NoticiaTenis("Open", "Nadal");
        noticiaTenis.calcularPrecioNoticia();
        noticiaTenis.calcularPuntuacionNoticia();

        NoticiaF1 noticiaF1 = new NoticiaF1("Ferrari");
        noticiaF1.calcularPrecioNoticia();
        noticiaF1.calcularPuntuacionNoticia();

        NoticiaMotociclismo noticiaMotociclismo = new NoticiaMotociclismo("Honda");
        noticiaMotociclismo.calcularPrecioNoticia();
        noticiaMotociclismo.calcularPuntuacionNoticia();

        int numero = 0;
        while(numero !=8) {
            //MENU DE OPCIONES
            System.out.println("Menu de Opciones");
            System.out.println("1.Introducir Redactor");
            System.out.println("2.Eliminar Redactor");
            System.out.println("3.Introducir Noticia a un Redactor");
            System.out.println("4.Eliminar Noticia");
            System.out.println("5.Mostrar todas las Noticias por Redactor");
            System.out.println("6.Calcular Puntuacion de la Noticia");
            System.out.println("7.Calcular Precio de la Noticia");
            System.out.println("8.Salir");

            Scanner lectura = new Scanner(System.in);
            System.out.println("Ingrese un numero de opcion");
            numero = lectura.nextInt();
            System.out.println("El numero ingresado es :" + numero);



            switch (numero) {
                case 1:
                    /*Redactor arrayRedactores[] = new Redactor[10];
                    arrayRedactores[0] = new Redactor("Arturo", "030400770");
                    arrayRedactores[1] = new Redactor("Jose", "092367852");
                    arrayRedactores[2] = new Redactor("Ana", "723094856");*/

                Scanner redactorData = new Scanner(System.in);
                System.out.println("Ingrese nombre:");
                String nombre = redactorData.next();
                System.out.println("Ingrese DNI:");
                String dni = redactorData.next();
                Redactor redactor = new Redactor(nombre,dni);


               redactoresArray.add(redactor);


               Iterator iterator = redactoresArray.iterator();
               while(iterator.hasNext()) {
                   Redactor elemento = (Redactor) iterator.next();
                   System.out.println("Nombre: " + elemento.nombre + " DNI: " + elemento.dni + " Sueldo: " + elemento.sueldo);
               }

               break;

                case 2:

                Scanner eliminarRedactor = new Scanner(System.in);
                System.out.println("Ingrese DNI para eliminar");
                String eliminar = eliminarRedactor.next();
                System.out.println("El DNI introducido es: "+ eliminar);
                    Iterator iterator1 = redactoresArray.iterator();
                    //while(iterator1.hasNext())
                    for(int i=0;i<redactoresArray.size();i++)
                    {

                        Redactor elemento = (Redactor) iterator1.next();
                        if(eliminar.equals(elemento.dni)){ redactoresArray.remove(i);}

                        System.out.println("la letra i es: "+i);
                        System.out.println("El iterador es: "+ iterator1);
                        System.out.println("eliminar: "+eliminar);
                        System.out.println("elemento :"+elemento.dni);
                        //System.out.println("Nombre: " + elemento.nombre + " DNI: " + elemento.dni + " Sueldo: " + elemento.sueldo);
                    }


                break;
                case 3:
                    Noticia noticia = new Noticia("Barza gana", "el equipo gano al fin", 0,0);
                    System.out.println(noticia.titular);


                    break;

                case 9:
                    //OPCION PARA VER LISTA DE REDACTORES
                    System.out.println("LISTA DE REDACTORES");
                    Iterator iterator3 = redactoresArray.iterator();
                    while(iterator3.hasNext()) {
                        Redactor elemento = (Redactor) iterator3.next();

                        System.out.println("Nombre: " + elemento.nombre + " DNI: " + elemento.dni + " Sueldo: " + elemento.sueldo);
                    }
                    System.out.println("\n");
                    break;

            }


        }

    }
}
