public class ex_ejercicio3 {

    public static void main(String[] args) {
        int[] lista = new int[]{10,20,30,40,50};
        int[][] lista2 = new int[lista.length][lista.length];
        int contador = 0;

        for (int i = 0; i < lista2.length; i++)
            {for (int e = 0; e < lista2[1].length; e++)
                {int elemento = lista2[i][e];
                if(i == e){ elemento = lista[i];
                contador = contador += elemento;}

    System.out.print(elemento + " ");}
    System.out.println();

}
    System.out.print(contador);
}
}
