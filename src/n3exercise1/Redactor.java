package n3exercise1;

public class Redactor {
    String nombre;
    String dni;
    int sueldo = 1500;

    public Redactor(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;

        System.out.println("Nombre del redactor: " + nombre  +
                "\nDNI del redactor: " + dni +
                "\nSueldo del redactor es: " + sueldo + " euros\n" );




    }
    public void introducirRedactor()
    {
        /*Redactor arrayRedactores[] = new Redactor[3];
        arrayRedactores[0]=redactor;
        for(int i=0;i<3;i++)
        {
            System.out.println(arrayRedactores[i].nombre);
        }*/

    }
}
