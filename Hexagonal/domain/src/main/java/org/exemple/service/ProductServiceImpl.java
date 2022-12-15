package org.exemple.service;

import org.exemple.data.ProductDto;
import org.exemple.data.ProductoDto;
import org.exemple.ports.api.ProductServicePort;
import org.exemple.ports.spi.ProductPersistencePort;
import org.exemple.ports.spi.ProductoPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductServiceImpl implements ProductServicePort {

    private ProductPersistencePort productPersistencePort;
    @Autowired
    public ProductServiceImpl(ProductPersistencePort productPersistence) {
    this.productPersistencePort = productPersistence;
    }

    @Override
    public ProductDto addProductDto(ProductDto productDto) {
        ProductDto producto = null;
        producto = productPersistencePort.addProductDto(productDto);
        return producto;
    }

    @Override
    public ProductDto updateInvoiceDto(ProductDto categoryDto) {
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
