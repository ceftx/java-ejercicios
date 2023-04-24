import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 10; //número de espacios y número recibido

        int s = n;

        for(int x = 0; x < n ; x++) {
            //System.out.print("*");
            for(int i = 0; i < s; i++){ // imprime el numero de espacios de mas espacios a menos,
                System.out.print(" ");
            }
            for(int p = 0; p <= x; p++ ){ // imprime el numero de x por linea
                System.out.print("x ");
            }
            s--; // se reduce el s para reducir en 1 unidad los espacios impresos
            System.out.println();
        }
    }
}