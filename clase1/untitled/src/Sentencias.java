public class Sentencias {
    public static void main(String[] args) {
        //Sentencias de control
        //if
        //if(condicion){
        //    //codigo
        //}
        //if(condicion){
        //    //codigo
        //}else{
        //    //codigo
        //}
        //if(condicion){
        //    //codigo  
        //}else if(condicion){
        //    //codigo
        //}else{
        //    //codigo
        //}
        //switch
        //switch(expresion){
        //    case valor1:
        //        //codigo
        //        break;
        //    case valor2:
        //        //codigo
        //        break;
        //    default:
        //        //codigo
        //        break;
        //}
        //while
        //while(condicion){
        //    //codigo
        //}
        //do{
        //    //codigo
        //}while(condicion);
        //for
        //for(inicializacion; condicion; incremento){
        //    //codigo
        //}
        //for each
        //for(tipoDato nombreVariable : arreglo){
        //    //codigo
        //}
        //break
        //continue
        //return
        //return valor;

        //ejemplo de foreach
        String[] nombres = {"Andrés", "Juan", "Pedro", "Maria"};
        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        }

        //ejemplo de bucle etiquetado
        inicio:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break inicio;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        
    }
}

