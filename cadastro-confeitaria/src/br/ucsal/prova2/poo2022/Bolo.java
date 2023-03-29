package br.ucsal.prova2.poo2022;

import java.util.*;

public class Bolo extends Produto {

    private int qtFatias;
    private String tema;

    private static List<String> temasBolos = new ArrayList<String>();

    public static void cadastrarBolo() {

        Bolo bolo = new Bolo(0, null, 0, 0, null);

        bolo.cadastrarProduto();

        System.out.print("Informe a quantidade mínima de fatias: ");
        bolo.setQtFatias(scan.nextInt());

        scan.nextLine();

        System.out.print("Informe o tema do bolo: ");
        bolo.setTema(scan.nextLine());

        temasBolos.add(bolo.getTema());
        produtos.add(bolo);

    }

    public static void listarTemas() {

        Set<String> bolosSet = new HashSet<String>(temasBolos);
        temasBolos.clear();
        temasBolos.addAll(bolosSet);

        for (String tema : temasBolos) {

            System.out.println(tema);

        }
    }

    public Bolo(int codigo, String descricao, int valorUni, int qtFatias, String tema) {
        super(codigo, descricao, valorUni);
        this.qtFatias = qtFatias;
        this.tema = tema;
    }

    public int getQtFatias() {
        return qtFatias;
    }

    public void setQtFatias(int qtFatias) {
        this.qtFatias = qtFatias;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

}
