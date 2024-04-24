package com.bosorio.instagram.dev.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Permitir todos los endpoints
                        .allowedOrigins("http://localhost:4200") // Permitir cualquier origen
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos HTTP permitidos
                        .allowedHeaders("*"); // Encabezados permitidos
            }
        };
    }

}
