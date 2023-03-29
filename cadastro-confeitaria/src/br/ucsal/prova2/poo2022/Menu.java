package br.ucsal.prova2.poo2022;

import java.util.*;

public class Menu {

    private static Scanner scan = new Scanner(System.in);

    public static void executarMenu() {

        int numeroOpcao = 0;

        while (numeroOpcao != 9) {

            System.out.println(
                    "--- Escolha a opção desejada --- \n (1) Cadastrar Bolo \n (2) Cadastrar Doces \n (3) Listar Produtos por valor \n (4) Listar tema(s) do(s) bolo(s) \n (9) Sair");

            numeroOpcao = scan.nextInt();

            switch (numeroOpcao) {

                case 1:
                    Bolo.cadastrarBolo();
                    break;

                case 2:
                    Doces.cadastrarDoces();
                    break;

                case 3:
                    Produto.listarProdutoValor();
                    break;

                case 4:
                    Bolo.listarTemas();
                    break;

                default:
                    break;
            }

        }

    }

}
