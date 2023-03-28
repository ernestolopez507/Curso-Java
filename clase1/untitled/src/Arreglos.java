import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
            //tipoDato[] nombreVariable;
        int[] numeros;
        //cantidad de elementos inmodificable
        numeros = new int[3];
        numeros[0] = 1;

        //declarar e inicializar de una vez
        int[] num = {1,2,3,4};

        //recorrer un arreglo usando for
        for(int i=0; i < num.length; i++){
            System.out.println("num: " + num[i]);
        }

        //recorrer un arreglo usando foreach
        for(int element : numeros){
            System.out.println("element: " + element);
        }

        //si no inicializamos algun elemento de un arreglo, por defecto para un primitivo tomara el defecto de ese primitivo(ej : para  los enteros 0); si es de una instancia de una clase por defecto sera null

        //la clase Arrays la podemos importar de java.utils y tiene metodos interesantes para array
        Arrays.sort(numeros);//ordenar de forma ascendente
    }
}
