package org.example.configuration;

import org.example.adapters.ProductJpaAdapter;
import org.example.adapters.ProductoJpaAdapter;
import org.exemple.ports.api.ProductServicePort;
import org.exemple.ports.api.ProductoServicePort;
import org.exemple.ports.spi.ProductPersistencePort;
import org.exemple.ports.spi.ProductoPersistencePort;
import org.exemple.service.ProductServiceImpl;
import org.exemple.service.ProductoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
    @Bean
    public ProductPersistencePort productPersistence(){
        return new ProductJpaAdapter() ;
    }

    @Bean
    public ProductServicePort productService(){
        return new ProductServiceImpl(productPersistence());
    }

}
