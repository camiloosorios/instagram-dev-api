package com.bosorio.instagram.dev.configs;

import com.bosorio.instagram.dev.clients.PostClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class PostClientConfig {

    @Bean
    @Qualifier("postMarshaller")
    public Jaxb2Marshaller postMarshaller() {
        Jaxb2Marshaller postMarshaller = new Jaxb2Marshaller();
        postMarshaller.setContextPath("com.bosorio.instagram.dev.wsdl.post");

        return postMarshaller;
    }

    @Bean
    public PostClient getPostClient(@Qualifier("postMarshaller") Jaxb2Marshaller marshaller) {
        PostClient postClient = new PostClient();
        postClient.setDefaultUri("http://localhost:8080/instagram-dev-backend/PostServiceImpl?wsdl");
        postClient.setMarshaller(marshaller);
        postClient.setUnmarshaller(marshaller);

        return postClient;
    }

}
