public class ArgumentosLineaComando {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento numero " + (i+1) + ": " + args[i]);
        }

        //javac nombre de la clase con la extension .java, esto compila y crea el archivo .class
        //java nombre de la clase, ejecuta el .class; le podemos pasar los argumentos separando con espacios
    }
}
