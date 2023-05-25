public class ex_ejercicio2{

    public static void main(String[] args) {

        String cadena = "hola, que tal?";
        String [] trozos = cadena.split(" ");
        int contador = 0;

        for (String palabra : trozos){
            contador++;
        }
        System.out.println("El texto esta formado por " + contador + " palabras");
        }
        
    }