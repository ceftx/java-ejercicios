
package Acumulaciones;
import java.util.Scanner;
/**
 * @author ceftx
 */
public class Repeticiones {
    public static void main(String Args[]){
        //Declaracion de objeto Scanner
        Scanner ent = new Scanner(System.in);
        //Declaracion de variables
        int n = 0, res = 0;
        
        System.out.println("Programa para acumular suma");
        System.out.println("A continuación podra ingresar la cantidad de\n" +
                "números que desee, cuando ingrese un cero(0)\n" +
                "se mostrará en pantalla la sumatoria de todos\n" +
                "los números ingresados.");
        
        do{
            System.out.println("Ingrese un número: ");
            n = ent.nextInt();
            res += n;
        }while(!(n == 0));
        
        System.out.println("El resultado de la sumatoria es: " + res + ".");
        
       
        
    }
}
