package model;

public class ItemPedido {
    private ItemCardapio item;
    private int quantidade;
    private String status;
    private String observacao;
    private String justificativaCancelamento;

    public ItemPedido (ItemCardapio item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
        
    }
    public void alterarStatus(String status) {
    }
    public void cancelar(String justificativa) {
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public ItemCardapio getItem() {
        return item;
    }
    
}
