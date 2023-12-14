package n1exercise1;



    public class Main {
        public static void main(String[] args)
        {
            Instrumento miviento = new Viento();
            miviento.tocar();
            System.out.println();


            Instrumento micuerda = new Cuerda();
            micuerda.tocar();
            System.out.println();

            Instrumento mipercusion = new Percusion();
            mipercusion.tocar();
            System.out.println();

            tocar(miviento, micuerda, mipercusion);


        }
        public static void tocar(Instrumento miviento, Instrumento micuerda, Instrumento mipercusion)
        {
            miviento.tocar();
            micuerda.tocar();
            mipercusion.tocar();


        }

    }

