package factory;
import model.*;

public abstract class Itensfactory {
    public abstract ItemCardapio criarItem(String nome, double preco);
}