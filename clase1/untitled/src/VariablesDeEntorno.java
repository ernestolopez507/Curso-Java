public class VariablesDeEntorno {
    public static void main(String[] args) {
        //el metodo getenv() de la clase System devuelve un mapa con las variables de entorno
        System.out.println(System.getenv());
        //podemos obtener el valor de una variable de entorno
        System.out.println(System.getenv("JAVA_HOME"));

        //las variables de entorno sirven para almacenar informacion que puede ser utilizada por el sistema operativo o por las aplicaciones
        //por ejemplo, podemos almacenar la ruta de un directorio en una variable de entorno y luego utilizarla en el codigo
        //ejemplo: la variable de entorno PATH almacena las rutas de los directorios donde se encuentran los ejecutables de los programas que queremos ejecutar desde la consola
        //si queremos ejecutar el programa "ls" desde la consola, el sistema operativo busca en los directorios que se encuentran en la variable de entorno PATH
        //si encuentra el ejecutable de "ls", lo ejecuta, sino, muestra un mensaje de error

        //con setx podemos crear variables de entorno en la terminal
        //setx nombre_variable valor_variable 
        //ejemplo: setx JAVA_HOME "C:\Program Files\Java\jdk1.8.0_221"
        //para ver las variables de entorno creadas, ejecutamos el comando set sin parametros
        //para eliminar una variable de entorno, ejecutamos el comando setx nombre_variable /d
        //ejemplo: setx JAVA_HOME /d
        
    }
}
