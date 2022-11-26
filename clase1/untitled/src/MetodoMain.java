//clase
public class MetodoMain {
    //metodos
    //el metodo main es el metodo principal que debe tener toda clase, es el metodo que se ejectuta de forma automatica y debe tener la siguiente extructura
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void variablesEnJava(){
        //Java es fuertemente tipado : esto quiere decir que a cada variable debe estar asociado un tipo de dato bien sea primitivo o un objeto(un tipo de una clase)
        //TipoDato nombreVariable;
        //Clases: PascalCase
        //variables: camelCase
        String saludo = "Hola Mundo";
        //atajos: sout y soutv
        System.out.println("saludo = " + saludo.toUpperCase());
        //tipado dinamico en java:
        var numero = 15;
        //se puede definir sin dar un valor
        String nombre;
        nombre = "Andrés";
    }

}