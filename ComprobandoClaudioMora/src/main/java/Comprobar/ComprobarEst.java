
package Comprobar;
//importe de librerisa y utilidades
import java.util.Scanner;
/**
 * @author ceftx
 */
public class ComprobarEst {
    
    public static void main(String Args[]){
        //Declaracion de escaner 
        Scanner ent = new Scanner(System.in);
        //Declaración de variables
        String nombre = " ";
        float cali = 0;
        System.out.println("Ingrese su nombre: ");
        nombre = ent.nextLine(); 
        System.out.println("Ingrese su calificación: ");
        cali = ent.nextFloat(); 
        if(cali < 10){
            System.out.println(nombre +", debe estudiar más, estas reprobado.");
        }else if(cali >= 10 && cali <= 13){
            System.out.println(nombre +", su nota es de: " + cali + ", y su expresión" +
                    " cualitativa es \"Bueno\".");
        }else if(cali >= 14 && cali <= 16){
            System.out.println(nombre +", su nota es de: " + cali + ", y su expresión" +
                    " cualitativa es \"Distinguido\".");
        }else if(cali >= 17 && cali <= 20){
            System.out.println(nombre +", su nota es de: " + cali + ", y su expresión" +
                    " cualitativa es \"Excelente, \nFelicitaciones, estás entre"
                    + " los mejores estudiantes\".");
        }
    }
}
