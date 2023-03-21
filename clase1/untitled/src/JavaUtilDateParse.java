import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        //con el metodo parse() de la clase Date se puede convertir un String a un objeto Date
        //el metodo parse() lanza una excepcion de tipo ParseException
        //por lo que es necesario capturarla
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formato.parse("01/01/2018");
            System.out.println(fecha);
        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
