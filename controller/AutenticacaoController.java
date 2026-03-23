package controller;

import factory.factory;
import model.Garcom;
import model.Usuario;

public class AutenticacaoController  {

    public Usuario autenticar(String login, String senha) {
        if (login.equals("garçom") && senha.equals("123")) {
            return Usuario.factory().criarGarçom();
        }
        if (login.equals("cozinheiro") && senha.equals("123")) {
            return Usuario.factory().criarCozinheiro();
        }
        if (login.equals("chefe de salão") && senha.equals("123")) {
            return Usuario.factory().criarChefeDeSalao();
        }
          return null;  
    }
}
