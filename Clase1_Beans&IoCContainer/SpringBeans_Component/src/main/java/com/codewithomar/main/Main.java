package com.codewithomar.main;

import com.codewithomar.beans.Client;
import com.codewithomar.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Client clientObj = context.getBean(Client.class);

        System.out.println("Client first name from Spring context is: " + clientObj.getFirstName());
        System.out.println("Client last name from Spring context is: " + clientObj.getLastName());
        System.out.println(clientObj.toString());

        String[] clientBeans = context.getBeanNamesForType(Client.class);
        for (String beanName : clientBeans) {
            System.out.println("Bean names: " + beanName);
        }
    }
}
