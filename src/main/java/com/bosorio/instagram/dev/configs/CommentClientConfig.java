package com.bosorio.instagram.dev.configs;

import com.bosorio.instagram.dev.clients.CommentClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CommentClientConfig {

    @Bean
    @Qualifier("commentMarshaller")
    public Jaxb2Marshaller commentMarshaller() {
        Jaxb2Marshaller commentMarshaller = new Jaxb2Marshaller();
        commentMarshaller.setContextPath("com.bosorio.instagram.dev.wsdl.comment");

        return commentMarshaller;
    }

    @Bean
    public CommentClient getCommentClient(@Qualifier("commentMarshaller") Jaxb2Marshaller marshaller) {
        CommentClient commentClient = new CommentClient();
        commentClient.setDefaultUri("http://localhost:8080/instagram-dev-backend/CommentServiceImpl?wsdl");
        commentClient.setMarshaller(marshaller);
        commentClient.setUnmarshaller(marshaller);

        return commentClient;
    }

}
