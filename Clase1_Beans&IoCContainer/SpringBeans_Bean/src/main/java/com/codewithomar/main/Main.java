package com.codewithomar.main;

import com.codewithomar.beans.Client;
import com.codewithomar.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        String[] clientBeans = context.getBeanNamesForType(Client.class);
        for (String beanName : clientBeans) {
            System.out.println("Bean name: " + beanName);
        }

        Client clientOmar = context.getBean(Client.class);

        System.out.println("\nBean clientOmar values: " + clientOmar.toString());
    }
}
