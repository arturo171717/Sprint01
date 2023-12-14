package n1exercise1;

public class Cuerda extends Instrumento{

        public Cuerda()
        {
            tipo = "cuerda";
        }
        public  void tocar()
        {
            System.out.println("Esta sonando un instrumento de " + tipo);
        }



    }

