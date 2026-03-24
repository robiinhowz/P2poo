package factory;
import model.*;

public class ItemCardapioFactory extends Itensfactory {
     @Override
     public ItemCardapio criarItem(String nome, double preco) {
         return new ItemCardapio(nome, preco);
     }
}
