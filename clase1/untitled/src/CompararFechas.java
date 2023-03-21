import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompararFechas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha una fecha");
        String fecha1 = sc.nextLine();
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaUsuario = formato.parse(fecha1);
            Date fechaActual = new Date();
            
            if (fechaActual.after(fechaUsuario)) {
                System.out.println("La fecha ingresada es anterior a la fecha actual");
            } else if (fechaActual.before(fechaUsuario)) {
                System.out.println("La fecha ingresada es posterior a la fecha actual");
            } else if (fechaActual.equals(fechaUsuario)) {
                System.out.println("La fecha ingresada es igual a la fecha actual");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //para comparar tambien se puede usar el metodo compareTo() de la clase Date
        //el metodo compareTo() devuelve un entero 
        //si el entero es menor a 0, la fecha es anterior a la fecha actual
        //si el entero es mayor a 0, la fecha es posterior a la fecha actual
        //si el entero es igual a 0, la fecha es igual a la fecha actual
        //System.out.println(fechaActual.compareTo(fechaUsuario));

        //estas mismas comparaciones se pueden realizar con la clase Calendar

    }    
}
