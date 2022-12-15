package org.example.adapters;

import org.example.repository.ProductoRepository;
import org.exemple.data.ProductDto;
import org.exemple.data.ProductoDto;
import org.exemple.ports.spi.ProductPersistencePort;
import org.exemple.ports.spi.ProductoPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductJpaAdapter implements ProductPersistencePort {

    @Autowired
    private ProductoRepository productoRepository;


    @Override
    public ProductDto addProductDto(ProductDto productDto) {
        return null;
    }

    @Override
    public ProductDto updateProductDto(ProductDto categoryDto) {
        return null;
    }

    @Override
    public void deleteProductDto(Integer id) {

    }

    @Override
    public List<ProductoDto> getProduct() {
        return null;
    }

    @Override
    public ProductoDto getProductDtoById(Integer id) {
        return null;
    }
}
