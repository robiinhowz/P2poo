package factory;

import model.Caixa;

public class factory {
    public static criarUsuario(String tipo) {
        
        if (tipo.equals("GARCOM")) {
            return new Garcom();
        }
        if (tipo.equals("COZINHEIRO")) {
            return new Cozinheiro();
        }
        if (tipo.equals("Chefe de salão")) {
            return new ChefeDeSalao();
        }
    throw new IllegalArgumentException();
    }
}