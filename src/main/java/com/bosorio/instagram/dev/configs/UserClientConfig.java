package com.bosorio.instagram.dev.configs;

import com.bosorio.instagram.dev.clients.UserClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class UserClientConfig {

    @Bean
    @Qualifier("userMarshaller")
    public Jaxb2Marshaller userMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.bosorio.instagram.dev.wsdl.user");
        return marshaller;
    }

    @Bean
    public UserClient getUserClient(@Qualifier("userMarshaller") Jaxb2Marshaller marshaller) {
        UserClient userClient = new UserClient();
        userClient.setDefaultUri("http://localhost:8080/instagram-dev-backend/UserServiceImpl?wsdl");
        userClient.setMarshaller(marshaller);
        userClient.setUnmarshaller(marshaller);

        return userClient;
    }
}
