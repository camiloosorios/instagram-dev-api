package com.bosorio.instagram.dev.configs;

import com.bosorio.instagram.dev.clients.ImageClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ImageClientConfig {

    @Bean
    @Qualifier("imageMarshaller")
    public Jaxb2Marshaller imageMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.bosorio.instagram.dev.wsdl.image");
        return marshaller;
    }

    @Bean
    public ImageClient getImageClient(@Qualifier("imageMarshaller") Jaxb2Marshaller marshaller) {
        ImageClient imageClient = new ImageClient();
        imageClient.setDefaultUri("http://localhost:8080/instagram-dev-backend/ImageServiceImpl?wsdl");
        imageClient.setMarshaller(marshaller);
        imageClient.setUnmarshaller(marshaller);

        return imageClient;
    }

}
