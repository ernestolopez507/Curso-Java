public class Operadores {
    public static void  main(String[] args){
        //operadores aritmeticos:
        //+ - * / %  ++ --
        //podemos usar los operadores aritmeticos con los numeros de tipo de dato primitivos y con sus respectivas clases de referencia

        //operadores combinados: -= += /= *= ...

        //Datos con los operadores de incremento y decremento
        //++a o --a | primero incrementara o decrementara el valor de a y luego lo devolvera, ej:
        int a = 1;
        int b = ++a;//en este casp tanto a como b valdran 2 ya que incremento a y luego le devolvio su valor a b
        System.out.println(a + " " + b);
        //a++ o a-- | primero devolvera el valor de a y luego lo incrementara, ej:
        int c = 1;
        int d = c++;//en este caso d valdra 1 ya que primero se devolvio el valor de c sin incrementar y luego se incremento c por lo que c si valdra 2
        System.out.println(c + " " + d);

        //operador ternario: condicion ? valor1 : valor2
        int resultado = 3>9 ? 2 : 1;
        System.out.println(resultado);

        //operadores relacionales:
        // < <= > >= != ==

        //operadores logicos
        // && || ! ^ --> and or not xor
        // & | --> and y or pero que evaluan las dos expresiones si o si. En el caso de && y || evaluara solamente una cuando ya da para saber el resultado de la operacion logica

        //operador intanceof --> compara si la clase a la que pertenece la variable es la que le pasamos
        //solo se puede comparar si es de la misma clase o de sus clases heredadas
        Object saludo = "Hello world!";
        System.out.println(saludo instanceof String);//true
        System.out.println(saludo instanceof Integer);//false
    }
}
