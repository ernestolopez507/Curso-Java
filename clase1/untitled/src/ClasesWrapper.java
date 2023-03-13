public class ClasesWrapper {
    public static void main(String args[]){
        //que son las clases wrapper
        //son clases que envuelven a los tipos primitivos para poder utilizarlos como objetos y poder acceder a sus metodos y atributos de manera mas comoda y poder utilizarlos en colecciones y demas estructuras de datos que solo aceptan objetos y no tipos primitivos como int, double, float, etc. 
        //Dan mas funcionalidad a los tipos primitivos
        //ejemplos de clases wrapper
        //Integer, Double, Float, Boolean, Character, Byte, Short, Long
        //tanto la clase Integer como Short, Byte, Long extienden de la clase Number y por lo tanto heredan sus metodos y atributos, es decir tienen los mismos metodos.
        //teniendo un objecto de una de las clases wrapper, podemos convertir el objeto a su tipo primitivo correspondiente y a otra clase wrapper si son compatibles.
        //tener cuidado y convertir de un chor hacia arriva y no de un tipo mas grande hacia uno mas chico, ya que puede perderse informacion.
        //tenemos metodos estaticos y de instancia, los estaticos son los que se pueden utilizar sin necesidad de crear un objeto de la clase, los de instancia son los que se utilizan a traves de un objeto de la clase.
        //ejemplo de metodos estaticos
        Integer numero = Integer.valueOf(10);
        //ejemplo de metodos de instancia
        Integer numero2 = Integer.valueOf(10);
        int numero3 = numero2.intValue();//esta es la forma de utilizar un metodo de instancia(la instancia es numero2)

        //constantes de Integer
        System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
        // metodos estaticos de Integer
        //convierte a entero primitivo
        int numero4 = Integer.parseInt("10");
        //convierte a entreo primitivo, con base
        int numero5 = Integer.parseInt("10", 2);
        //convierte a String
        String numero6 = Integer.toString(10);
        //convierte a String, con base
        String numero7 = Integer.toString(10, 2);
        //convierte string a Integer
        Integer numero8 = Integer.valueOf("10");
        //convierte string a Integer, con base
        Integer numero9 = Integer.valueOf("10", 2);
        //metodos de instancia de Integer
        //convierte a entero primitivo
        int numero10 = numero8.intValue();
        //convierte a String
        String numero11 = numero8.toString();
        //convierte a String, con base
        String numero12 = numero8.toString(2);

        

        



    }
}
