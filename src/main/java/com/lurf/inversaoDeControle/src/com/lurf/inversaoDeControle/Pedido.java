package com.lurf.inversaoDeControle;

public class Pedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.gravar();

    }

    private EnviarEmails enviar = EnviarEmails.obterDadosEmail();

    void gravar(){
        this.enviar.retornar("Pedido criado!");
    }

}
