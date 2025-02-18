package controller;

public class ParesController {
    public int fpares(int vetor[]) {
        return fparesRecursivo(vetor, vetor.length);
    }

    public int fparesRecursivo(int vetor[], int tamanho) {
        if (tamanho == 0) {
            return 0;
        } else {
            int ultimoElemento = vetor[tamanho - 1];
            if (ultimoElemento % 2 == 0) {
                return 1 + fparesRecursivo(vetor, tamanho - 1);
            } else {
                return fparesRecursivo(vetor, tamanho - 1);
            }
        }
    }
}
