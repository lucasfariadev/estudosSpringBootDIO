package com.lurf.estudosSpringBootDio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);

        livro.setNome("Victor Howckyns E A Nova Velha Raça");
        livro.setCodigo("V3HEAN0");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Lucas Faria");

        livro.exibir();

        ((AbstractApplicationContext) factory).close();
    }
}
