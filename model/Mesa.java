package model;

public class Mesa {
    private int numero;
    private String status;

    public Mesa(int numero, String status)
    {
        this.numero = numero;
        this.status = status;
    }
    
    public void alterarStatusMesa(int numero, String status) {
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}