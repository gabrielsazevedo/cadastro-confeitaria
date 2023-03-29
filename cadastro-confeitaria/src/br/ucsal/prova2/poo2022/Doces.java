package br.ucsal.prova2.poo2022;

public class Doces extends Produto {

    private int qtMinima;

    public static void cadastrarDoces() {

        Doces doces = new Doces(0, null, 0, 0);

        doces.cadastrarProduto();

        do {

            try {

                System.out.println("Informe a quantidade mínima para o pedido: ");
                doces.setQtMinima(scan.nextInt());

                if (doces.getQtMinima() < 50) {

                    throw new QtdMinPedidoInvalidaException(doces.getQtMinima());

                }

            } catch (QtdMinPedidoInvalidaException exception01) {

                exception01.printStackTrace();

            }

        } while (doces.getQtMinima() < 50);

        produtos.add(doces);

    }

    public Doces(int codigo, String descricao, int valorUni, int qtMinima) {
        super(codigo, descricao, valorUni);
        this.qtMinima = qtMinima;
    }

    public int getQtMinima() {
        return qtMinima;
    }

    public void setQtMinima(int qtMinima) {
        this.qtMinima = qtMinima;
    }

}
