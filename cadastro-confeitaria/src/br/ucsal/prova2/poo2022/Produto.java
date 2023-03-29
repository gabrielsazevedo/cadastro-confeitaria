package br.ucsal.prova2.poo2022;

import java.util.*;

public class Produto implements Comparable<Produto> {

    protected int codigo;
    protected String descricao;
    protected int valorUni;

    protected static List<Produto> produtos = new ArrayList<Produto>();

    protected static Scanner scan = new Scanner(System.in);

    public void cadastrarProduto() {

        System.out.print("Informe o código do produto: ");
        setCodigo(scan.nextInt());

        scan.nextLine();

        System.out.print("Informe a descrição do produto: ");
        setDescricao(scan.nextLine());

        System.out.print("Informe o valor unitário do produto em inteiro: ");
        setValorUni(scan.nextInt());

    }

    public static void listarProdutoValor() {

        Collections.sort(produtos);

        for (Produto produto : produtos) {

            System.out.println(produto.getValorUni());

        }

    }

    public Produto(int codigo, String descricao, int valorUni) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorUni = valorUni;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValorUni() {
        return valorUni;
    }

    public void setValorUni(int valorUni) {
        this.valorUni = valorUni;
    }

    @Override
    public int compareTo(Produto oProduto) {

        return (this.valorUni - oProduto.getValorUni());

    }

}
