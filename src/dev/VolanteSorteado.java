package dev;

import java.util.Arrays;

public class VolanteSorteado {
    int[] vetor = new int[14];
    int aux;
    public VolanteSorteado(){
        for(int ind = 0; ind<14; ind++) {
            vetor[ind] = (int) (Math.random()*(60-1+1)+(1));
        }
        for (int o = 0; o<vetor.length; o++) {
            for (int iv = 0; iv < vetor.length; iv++) {
                for (int ip = iv + 1; ip < vetor.length; ip++) {
                    if (vetor[iv] == vetor[ip]) {
                        vetor[iv] = (int) (Math.random() * (60 - 1 + 1) + (1));
                    }
                }
            }
            for (int i = 0; i < vetor.length; i++) {
                for (int p = i + 1; p < vetor.length; p++) {
                    if (vetor[i] > vetor[p]) {
                        aux = vetor[i];
                        vetor[i] = vetor[p];
                        vetor[p] = aux;
                    }
                }
            }
        }
    }
}
