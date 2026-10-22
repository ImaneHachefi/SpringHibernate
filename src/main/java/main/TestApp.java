package main;

import main.config.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        System.out.println("Contexte Spring initialisé avec succès !");
        context.close();
    }
}
