public class Strings {
    public static void main(String[] args){
      //los tipos de referencia en java se pueden crear con el operador new
        String str = new String("Ernesto");
        //Los strings se pueden crear de una forma mas comoda:
        String str2 = "Ernesto";
        String str5 = "Jorge";

        //Los String son inmutables, es decir cada que hagamos una operacion con un metodo a un string no modifica el string sino devuelve  una nueva instancia

        //concatenar strings con  + y com .concat()
        String str3 = str + str2;
        String str4 = str.concat(str2);

        //comparar strings. no se puede comparar con el operador == como se hace con los datos primitivos porque el operador == comparara que sean ojetos iguales y no el contenido
        //para comparar el contenido de los esting se usa .equals();
        /*System.out.println(str == str2);
        System.out.println(str == str);
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));//ignora mayusculas y minusculas

        //metodos importantes
        System.out.println(str.length());//cantidad de caracteres
        System.out.println(str.trim());//Elimina los espacios en blanco del inicio y del final
        System.out.println(str.charAt(0));//Extrae caracter de la posicion indicada
        char[] caracteres = str.toCharArray(); //combierte en un arreglo de caracteres
        System.out.println(str.substring(2,3));//extrae la cadena de entre las posiciones que se le pasa
        System.out.println(str.indexOf('E'));//Indica en que posicion se encuentra la primera coincidencia del valor buscado, buscado desde el principio
        System.out.println(str.lastIndexOf("E"));//Indica en que posicion se encuentra la primera coincidencia del valor buscado, buscado desde el final
        String[] arraystr = str.split('n');*///Divide la cadena en varias subcadenas de acuerdo con el caracter de division pasado como parametro


        //Los String son inmutables y esto puede generear problemas de performance en la aplicacion por los siguiente:
        //Los objetos String son constantes e inmutables
        //Una vez creados, los objetos Strings no pueden ser modificados. Para entender esto analicemos el siguiente código:
        //
        //String s = "Hello";
        //s = s + "edu";
        //En la primer línea, se crea un objeto String “Hello” y se guarda una referencia a él en la variable s.
        //
        //En la segunda línea se crea otro objeto String “edu” y se realiza la operación concatenación de los objetos “Hello “ y “edu”. La concatenación produce un nuevo objeto String “Hello edu” cuya referencia será guardada en la variable s.
        //
        //Los objetos “Hello” y “edu” son obsoletos ya que nadie les hace referencia, por lo que nadie los usará. La máquina virtual de Java tiene un recolector de basura; “garbage collector”, que se encarga de limpiar de la memoria estos objetos.
        //
        //Problemas de memoria con Strings
        //Cuando manipulamos Strings, concatenando, insertando o reemplazando caracteres se crean muchos objetos que son descartados rápidamente. Esta creación de objetos puede producir un incremento en el uso de la memoria.
        //
        //El recolector de basura de Java, limpia la memoria pero esto tiene un costo de tiempo. Si creamos y destruimos muchos objetos, la performance de nuestro programa puede decaer sustancialmente.

        StringBuilder sb = new StringBuilder("Hola");
        System.out.println(sb);
        sb.append(" jeje");
        System.out.println(sb);//ya es mutable

       //Las instancias de StringBuilder no son seguras para que las usen varios subprocesos. Si se requiere dicha sincronización, se recomienda utilizar StringBuffer. String Builder no es seguro para subprocesos y tiene un alto rendimiento en comparación con String buffer.

        boolean vacio = str.isEmpty();//valida que no sea vacio
        boolean valido = str.isBlank();//valida que no sea vacio,null o un espacio
    }

}
