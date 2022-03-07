import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o  valor de n das matrizes Quadradas A e B: ");
        n = Integer.parseInt(entrada.nextLine());

        MatrizesAeB matrizesAeB = new MatrizesAeB(n);

        SomaMatriz somaMatriz = new SomaMatriz(matrizesAeB.matrizA, matrizesAeB.matrizB, n);
        MultiplicaMatriz multiplicaMatriz = new MultiplicaMatriz(matrizesAeB.matrizA, matrizesAeB.matrizB, n);

    }


}
