/*
 * eeeeeehhhhh (>•-•)>
 */
package programa01;
import java.util.Scanner;

/* autor: nadie
*/

public class Programa01 {
    
    /* El programa solicita edad, captura la edad, efectúa el cálculo del
    /  peso ideal y muestra el resultado.
    */
    
    public static void main(String[] args) {
        int edadCapturada;
        int pesoIdeal;
        solicitarEdad();
        edadCapturada   = capturarEdad();
        pesoIdeal       = calcularPesoIdeal(edadCapturada);
        mostrarPesoIdeal(pesoIdeal);
    }
    public static void solicitarEdad(){
        System.out.print("Ingrese Edad: ");
    }
    public static int capturarEdad(){
        Scanner entrada = new Scanner(System.in);
        int edadCapturada = entrada.nextInt();
        return edadCapturada;
    }
    public static int calcularPesoIdeal(int edad){
        int pesoIdeal = edad*2+8;
        return pesoIdeal;
    }
    public static void mostrarPesoIdeal(int pesoIdeal){
        System.out.println("El peso ideal es "+pesoIdeal);
    }
}
