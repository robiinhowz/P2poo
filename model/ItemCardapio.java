 package model;

public class ItemCardapio {
    private String nome;   
    private double precoVenda;
    private boolean disponivel;

    public ItemCardapio(String nome, double precoVenda) {
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.disponivel = true;
    }
    public void alterarPreco(double valor) {
    }
    public boolean verificarDisponibilidade() {
        return disponivel;
    }
    public double getPrecoVenda() {
        return precoVenda;
    }

}
