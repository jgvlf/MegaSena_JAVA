package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        String CPF;
        String qtdTermos;
        boolean verifS;
        String res;
        int qtd;
        Scanner scanner = new Scanner(System.in);

        int aux;
        int[][] volanteAposta = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60}};
        String[][] volanteApostaS = new String[6][10];
        String[][] matrizNome =
                {
                        {"   ", " # ", " # ", " # ", " ", " ", " # ", " # ", " # ", " # ", "   "},
                        {"   ", "   ", " # ", "   ", " ", " ", " # ", "   ", "   ", "   ", "   "},
                        {"   ", "   ", " # ", "   ", " ", " ", " # ", "   ", " # ", " # ", "   "},
                        {" # ", "   ", " # ", "   ", " ", " ", " # ", "   ", "   ", " # ", "   "},
                        {" # ", " # ", " # ", "   ", " ", " ", " # ", " # ", " # ", " # ", "   "}
                };
        System.out.println();
        for (int linhas = 0; linhas < 5; linhas++) {
            for (int colunas = 0; colunas < 11; colunas++) {
                System.out.print(matrizNome[linhas][colunas]);
            }
            System.out.println();
        }
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Olá " + nome + ", digite seu CPF: ");
        CPF = scanner.nextLine();
        while (true) {
            while (true) {
                System.out.println(nome + ", digite quantidade de números do jogo.");
                qtdTermos = scanner.nextLine();
                verifS = qtdTermos.matches("^[0-9]+$");
                if (!verifS) {
                    System.out.println("Por favor, digite um número");
                } else {
                    qtd = Integer.parseInt(qtdTermos);
                    if (5 < qtd && qtd < 15) {
                        break;
                    } else {
                        System.out.println("Por favor digite um número entre 6-14");
                    }
                }
            }
            int[] vetor = new int[qtd];
            for (int linhas = 0; linhas < 6; linhas++) {
                for (int colunas = 0; colunas < 10; colunas++) {
                    if (linhas == 0 && colunas == 9)
                        System.out.print(volanteAposta[linhas][colunas]);

                    else if (linhas == 0) {
                        String vA = String.valueOf(volanteAposta[linhas][colunas]);
                        System.out.print("0" + vA + " ");

                    } else if (colunas == 9) {
                        System.out.print(volanteAposta[linhas][colunas]);
                    } else {
                        System.out.print(volanteAposta[linhas][colunas] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println("\n\n\n");
            for (int ind = 0; ind < qtd; ind++) {
                vetor[ind] = (int) (Math.random() * (60 - 1 + 1) + (1));
            }
            for (int o = 0; o < vetor.length; o++) {
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
            System.out.println(Arrays.toString(vetor));
            System.out.println("\n\n\n");
            for (int linhas = 0; linhas < 6; linhas++) {
                for (int colunas = 0; colunas < 10; colunas++) {
                    volanteApostaS[linhas][colunas] = String.valueOf(volanteAposta[linhas][colunas]);
                }
            }
            for (int vetorElement = 0; vetorElement < vetor.length; vetorElement++) {
                for (int linhas = 0; linhas < 6; linhas++) {
                    for (int colunas = 0; colunas < 10; colunas++) {
                        if (vetor[vetorElement] == volanteAposta[linhas][colunas]) {
                            volanteApostaS[linhas][colunas] = "XX";
                            break;
                        }
                    }
                }
            }
            for (int linhas = 0; linhas < 6; linhas++) {
                for (int colunas = 0; colunas < 10; colunas++) {
                    if (linhas == 0 && colunas == 9)
                        System.out.print(volanteApostaS[linhas][colunas]);

                    else if (linhas == 0 && !volanteApostaS[linhas][colunas].equals("XX")) {
                        String vA = String.valueOf(volanteApostaS[linhas][colunas]);
                        System.out.print("0" + vA + " ");

                    } else if (colunas == 9) {
                        System.out.print(volanteApostaS[linhas][colunas]);
                    } else {
                        System.out.print(volanteApostaS[linhas][colunas] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            while (true) {
                System.out.println("Deseja continuar? [S/N]");
                res = scanner.nextLine().toUpperCase();
                if (res.equals("S") || res.equals("N")){
                    break;
                }
                else{
                    System.out.println("Por favor, digite apenas \"S\" ou \"N\".");
                }
            }
            if (res.equals("N"))
                break;
        }
    }
}
