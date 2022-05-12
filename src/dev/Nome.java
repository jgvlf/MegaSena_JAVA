package dev;

public class Nome {
    public Nome() {
        String[][] matrizNome =
                        {
                        {"   ", " # ", " # ", " # ", " ", " ", " # ", " # ", " # ", " # ", "   "},
                        {"   ", "   ", " # ", "   ", " ", " ", " # ", "   ", "   ", "   ", "   "},
                        {"   ", "   ", " # ", "   ", " ", " ", " # ", "   ", " # ", " # ", "   "},
                        {" # ", "   ", " # ", "   ", " ", " ", " # ", "   ", "   ", " # ", "   "},
                        {" # ", " # ", " # ", "   ", " ", " ", " # ", " # ", " # ", " # ", "   "}
                        };
        for (int linhas = 0; linhas < 5; linhas++) {
            for (int colunas = 0; colunas < 11; colunas++) {
                System.out.print(matrizNome[linhas][colunas]);
            }
            System.out.println();
        }
    }
}
