package model;

public class Garcom extends Usuario {
    public Pedido abrirPedido(Mesa mesa) {
        return new Pedido();
    }
    public ItemPedido registrarPedido(ItemCardapio item, int quantidade) {
        return new ItemPedido(item, quantidade);
    }
    public void solicitarFechamento(Pedido pedido) {
    }



}


