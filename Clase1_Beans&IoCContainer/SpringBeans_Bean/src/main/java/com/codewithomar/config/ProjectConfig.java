package com.codewithomar.config;

import com.codewithomar.beans.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "clientOmar")
    @Primary
    Client client1() {
        Client client = new Client();
        client.setFirstName("Omar");
        client.setLastName("Montoya");
        return client;
    }

    @Bean(value = "clientMarlly")
    Client client2() {
        Client client = new Client("Marlly", "Guido");
        return client;
    }

    @Bean("clientKai")
    Client client3(){
        Client client = new Client();
        client.setFirstName("Kai");
        return client;
    }

    @Bean
    Client client4(){
        Client client = new Client();
        return client;
    }
}
