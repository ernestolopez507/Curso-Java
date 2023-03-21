import java.text.SimpleDateFormat;
import java.util.Date;
class JavaUtilDate {
    public static void main(String[] args) {
        //la clase Date es una clase que representa una fecha y hora
        //Date nos permite obtener la fecha y hora del sistema
        Date fecha = new Date();
        System.out.println(fecha);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(fecha));
        String fechaStr = sdf.format(fecha);
        System.out.println(fechaStr);
        //la clase SimpleDateFormat nos permite formatear la fecha y hora en un formato deseado
        //podemos convertir un texto a fecha y hora con el metodo parse
        //podemos convertir una fecha y hora a texto con el metodo format
        //ejemplos de formato de fecha y hora en Java documnetacion
        //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
    }
}