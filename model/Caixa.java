package model;
import java.util.Date;

import strategy.Pagamento;

public class Caixa {
    private Date data = new Date();
    
    public Pagamento adicionarPagamento(Pagamento pagamento) {
        return pagamento;
    }
    public double calcularTotal() {
        return 0.0;
    }
    public double calcularTotalPorForma(String formaPagamento) {
        return 0.0;
    }
    public void fechar() {
    }
}