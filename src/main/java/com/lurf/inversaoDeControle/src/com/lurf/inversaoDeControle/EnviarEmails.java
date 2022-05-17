package com.lurf.inversaoDeControle;

public class EnviarEmails {

    public EnviarEmails(String tipo, String endereco, String senha){

    }

    static EnviarEmails obterDadosEmail(){
       return new EnviarEmails("stmp","contato@email.com","senha");
    }

    void retornar(String mensagem){
        System.out.println("Email enviado!");

    }
}
