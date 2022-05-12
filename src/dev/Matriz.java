package dev;

public class Matriz {
    public Matriz() {
        int[][] volanteAposta = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60}};

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
    }
}
