package view;
import controller.PedidoController;
import model.*;
import strategy.*;
import factory.*;

public class view {
public static void main(String[] args) {
    PedidoController pedidoController = new PedidoController();
    Mesa mesa1 = new Mesa(1, "Disponível");

    Itensfactory factory = new ItemCardapioFactory();
    ItemCardapio pizza = factory.criarItem("Pizza", 60.0);
    ItemCardapio suco = factory.criarItem("Suco de uva", 15.0);
    ItemCardapio hamburguer = factory.criarItem("Hambúrguer", 25.0);
    ItemCardapio sobremesa = factory.criarItem("Sobremesa", 10.0);

    Garcom garcom = new Garcom();
    Pedido pedido = pedidoController.criarPedido(garcom, mesa1);

    ItemPedido itemPizza = pedidoController.adicionarItem(pedido, pizza, 2);
    ItemPedido itemSuco = pedidoController.adicionarItem(pedido, suco, 1);
    ItemPedido itemHamburguer = pedidoController.adicionarItem(pedido, hamburguer, 2);
    ItemPedido itemSobremesa = pedidoController.adicionarItem(pedido, sobremesa, 1);

    pedidoController.alterarStatusItem(itemPizza, "Em preparo");
    pedidoController.alterarStatusItem(itemSuco, "Pronto");
    pedidoController.alterarStatusItem(itemHamburguer, "Em preparo");

    pedidoController.cancelarItem(itemHamburguer, "Cliente desistiu");

    pedidoController.fecharPedido(garcom, pedido);

    double total = pedidoController.calcularTotal(pedido);
    System.out.println("Total do pedido: R$ " + total);

    Caixa caixa = new Caixa();
    caixa.adicionarPagamento(new Pagamento(total, "Cartão de crédito"));
}
}