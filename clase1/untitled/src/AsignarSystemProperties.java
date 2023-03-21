import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
public class AsignarSystemProperties {
    public static void main(String[] args){
        //podemos asignar propiedades del sistema
        System.setProperty("miPropiedad", "valor de mi propiedad");
        //podemos obtener el valor de la propiedad
        System.out.println("Valor de miPropiedad: " + System.getProperty("miPropiedad"));
        //podemos obtener una lista de las propiedades del sistema
        //System.getProperties().list(System.out);

        //tambien podemos crear las propiedades del sistema desde un archivo de propiedades .properties
        //para ello debemos crear una instancia de la clase FileInputStream, que se encarga de leer el archivo y obtiene el contenido pero en formato binario y se lo pasamos al metodo load de la clase Properties
        Properties propiedades = new Properties();
        try {
            propiedades.load(new FileInputStream("clase1/untitled/src/config.properties"));
            System.setProperties(propiedades);
            System.getProperties().list(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
