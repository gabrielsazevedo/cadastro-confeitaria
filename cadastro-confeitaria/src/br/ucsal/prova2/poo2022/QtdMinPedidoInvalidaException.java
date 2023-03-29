package br.ucsal.prova2.poo2022;

public class QtdMinPedidoInvalidaException extends Exception {

    private int qtMinima = 50;

    public QtdMinPedidoInvalidaException(int qtMinima) {
        super();
        this.qtMinima = qtMinima;
    }

    @Override
    public String toString() {
        return "Insira um número maior que 50, você inseriu " + qtMinima;
    }

}
