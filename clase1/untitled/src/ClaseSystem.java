import java.util.Properties;

public class ClaseSystem {
    public static void main(String[] args){
        //con la clase System podemos obtener informacion del sistema
        //como por ejemplo la version de java que estamos usando
        System.out.println("Version de Java: " + System.getProperty("java.version"));
        //tambien podemos obtener la version del sistema operativo
        System.out.println("Version de SO: " + System.getProperty("os.version"));
        //tambien podemos obtener el nombre del usuario
        System.out.println("Nombre de usuario: " + System.getProperty("user.name"));
        //tambien podemos obtener el directorio de trabajo
        System.out.println("Directorio de trabajo: " + System.getProperty("user.dir"));
        //tambien podemos obtener la ruta de la clase
        System.out.println("Ruta de la clase: " + ClaseSystem.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        //tambien podemos obtener una lista de las propiedades del sistema
        System.getProperties().list(System.out);
        //tambien podemos obtener el tiempo de ejecucion del programa
        long tiempoInicio = System.currentTimeMillis();
        //line separator
        System.out.println(System.lineSeparator());
        //podemos obtener variables de entorno
        //en fin, varias informaciones del sistema que podemos utilizar en nuestras aplicaciones java
        //para obtener mas detalles sobre la clase System, pueden consultar la documentacion oficial de java
        //https://docs.oracle.com/javase/8/docs/api/java/lang/System.html
    }
}
