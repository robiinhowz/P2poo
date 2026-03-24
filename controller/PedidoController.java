package controller;
import factory.factory;
import model.*;

public class PedidoController { 
    public Pedido criarPedido(Garcom garcom, Mesa mesa) {
        return garcom.abrirPedido(mesa);
    }
    public ItemPedido adicionarItem(Pedido pedido, ItemCardapio item, int quantidade) {
        ItemPedido itemPedido = new ItemPedido(item, quantidade);
        pedido.adicionarItem(itemPedido);
        return itemPedido;
    }
    public void alterarStatusItem(ItemPedido itemPedido, String status) {
        itemPedido.setStatus(status);
    }
    public void cancelarItem(ItemPedido itemPedido, String justificativa) {
        itemPedido.cancelar(justificativa);
    }
    public void fecharPedido(Garcom garcom, Pedido pedido) {
        garcom.solicitarFechamento(pedido);
    }
    public double calcularTotal(Pedido pedido) {
        return pedido.calcularTotal();
    }
}
