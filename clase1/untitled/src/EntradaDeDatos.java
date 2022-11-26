import javax.swing.*;
import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        //ventana de dialogo
        String numeroStr = JOptionPane.showInputDialog("Ingrese un numero entero");
        int nroDecimal = Integer.parseInt(numeroStr);
        System.out.println("nroDecimal = " + nroDecimal);
        JOptionPane.showMessageDialog(null, "Hola");

        //terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String numero2str = scanner.nextLine();
        try {
            Integer numero2 = Integer.parseInt(numeroStr);
        }catch (NumberFormatException error){
            System.out.println("Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

    }
}
