package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Pedido {

    private Date dataHora = new Date();
    private String status;
    private double taxaServico = 0.1;
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(ItemPedido item) { 
        itens.add(item);
    }
    public void removerItem(ItemPedido item) {
    }
    
    public double calcularTotal() {
    double total = 0;

    for (ItemPedido item : itens) {
        total += item.getQuantidade() * item.getItem().getPrecoVenda();
    }
    return total * taxaServico;
    }

    public void fecharPedido() {
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}