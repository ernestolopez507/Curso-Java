import java.util.Date;

public class GetTimeJava {
    public static void main(String[] args) {
        //el metodo getTime() de la clase Date nos devuelve la fecha y hora en milisegundos desde el 1 de enero de 1970
        var fecha = new Date();
        System.out.println(fecha.getTime());
        System.out.println(fecha);
    }
}
