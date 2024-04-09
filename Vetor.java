import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
    int[] vetor = new int[10];

    vetor[0] = x;
    vetor[1] = vetor[0] * 2;
    vetor[2] = vetor[1] * 2;
    vetor[3] = vetor[2] * 2;
    vetor[4] = vetor[3] * 2;
    vetor[5] = vetor[4] * 2;
    vetor[6] = vetor[5] * 2;
    vetor[7] = vetor[6] * 2;
    vetor[8] = vetor[7] * 2;
    vetor[9] = vetor[8] * 2;

    System.out.println("N" + "[0]"  + " = " + vetor[0]);
    System.out.println("N" + "[1]"  + " = " + vetor[1]);
    System.out.println("N" + "[2]"  + " = " + vetor[2]);
    System.out.println("N" + "[3]"  + " = " + vetor[3]);
    System.out.println("N" + "[4]"  + " = " + vetor[4]);
    System.out.println("N" + "[5]"  + " = " + vetor[5]);
    System.out.println("N" + "[6]"  + " = " + vetor[6]);
    System.out.println("N" + "[7]"  + " = " + vetor[7]);
    System.out.println("N" + "[8]"  + " = " + vetor[8]);
    System.out.println("N" + "[9]"  + " = " + vetor[9]);
 
    }
 
}
