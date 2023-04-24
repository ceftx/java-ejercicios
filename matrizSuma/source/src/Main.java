import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int [][] matriz1,  matriz2;
        int n = 0, x = 1;

        //creacion de matriz
        System.out.println("Ingrese a continuacion los datos solicitados: ");
        System.out.println("Ingrese el tamaño de la matriz( 3x3 = 3, 4x4 = 4): ");
        n = sc.nextInt();
        matriz1 = new int [n][n];
        matriz2 = new int [n][n];
        for(int i = 0; i < n; i++){
            for(int o = 0; o < n; o++){
                System.out.print("Ingrese el elemento " + x + ": ");
                matriz1[i][o] = sc.nextInt();
                System.out.println();
                x++;
            }
        }
        x = 1;
        System.out.println("Ingrese a continuacion de una segunda matriz de igual tamaño: ");
        for(int i = 0; i < n; i++){
            for(int o = 0; o < n; o++){
                System.out.print("Ingrese el elemento " + x + ": ");
                matriz2[i][o] = sc.nextInt();
                System.out.println();
                x++;
            }
        }

        for(int i = 0; i < n; i++){
            for(int o = 0; o < n; o++){
                System.out.print( matriz1[i][o] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            for(int o = 0; o < n; o++){
                System.out.print( matriz2[i][o] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++){
            for(int o = 0; o < n; o++){
                System.out.print( (matriz1[i][o] + matriz2[i][o])+ " ");
            }
            System.out.println();
        }
    }
}