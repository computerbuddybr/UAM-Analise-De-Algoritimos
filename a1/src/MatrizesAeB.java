public class MatrizesAeB {
    public int[][] matrizA;
    public int[][] matrizB;
    MatrizesAeB(int n){
        this.matrizA = new int[n][n];
        this.matrizB = new int[n][n];
        this.criandoMatriz(n, 1);
    }

    private void criandoMatriz(int n, int numeroInicial){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                this.matrizA[i][j] = numeroInicial + 2;
                this.matrizB[i][j] = numeroInicial * 2;
                numeroInicial++;
            }
        }

    }
}
