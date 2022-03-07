public class SomaMatriz {
    public int[][] dadosC;

    SomaMatriz(int[][] dadosA, int[][] dadosB, int n) {
        long tempoInicial = System.currentTimeMillis();
        this.dadosC = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.dadosC[i][j] = dadosA[i][j] + dadosB[i][j];
            }
        }
        long tempoFinal = System.currentTimeMillis();
        long tempoTotal = tempoFinal - tempoInicial;
        System.out.println("A SomaMatriz levou " + tempoTotal + " milisegundos.");
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
