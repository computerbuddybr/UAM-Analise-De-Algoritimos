public class MultiplicaMatriz {
    public int[][] dadosC;

    MultiplicaMatriz(int[][] dadosA, int[][] dadosB, int n){
        long tempoInicial = System.currentTimeMillis();
        this.dadosC = new int[n][n];
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n; j++){
                //TODO: verificar se está certo. Ver um método para calcular tempo que leva
                this.dadosC[i][j] = dadosA[i][j] + dadosB[i][j];
                for(int k = 0; k < n; k++){
                    this.dadosC[i][j] = this.dadosC[i][j] + dadosA[i][k] * dadosB[k][j];
                }

            }
        }
        long tempoFinal = System.currentTimeMillis();
        long tempoTotal = tempoFinal - tempoInicial;
        System.out.println("A MultiplicaMatriz levou " + tempoTotal + " milisegundos.");
        System.out.println("A matriz final ficou: ");
        this.mostraMatrizFinal(n);

    }
    private void mostraMatrizFinal(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", this.dadosC[i][j]);
            }
            System.out.println();

        }

    }
}
