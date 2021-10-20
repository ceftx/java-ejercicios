
package entero;
import java.util.Scanner;
/**
 *
 * @author ceftx
 */

public class Decision {
    
    public static void validaNumero(int n){
        if(n >= 0){
            System.out.println("El número ingresado es positivo.");
        }else{
            System.out.println("El número ingresado es negativo.");
        }
    }
    
    public static void main(String Args[]){
        Scanner ent = new Scanner(System.in);
        int nume = 0; 
        System.out.println("Ingrese un número: ");
        nume = ent.nextInt();
        System.out.println("A continuación, se verificará si es un numero" +
                " positivo o negativo.");
        validaNumero(nume);
        
    }
}
