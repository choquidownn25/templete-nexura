package org.exemple.ports.spi;

import org.exemple.data.ProductDto;
import org.exemple.data.ProductoDto;

import java.util.List;

public interface ProductPersistencePort {
    ProductDto addProductDto(ProductDto productDto);
    ProductDto updateProductDto(ProductDto categoryDto);
    void deleteProductDto(Integer id);
    List<ProductoDto> getProduct();
    ProductoDto getProductDtoById(Integer id);
}
