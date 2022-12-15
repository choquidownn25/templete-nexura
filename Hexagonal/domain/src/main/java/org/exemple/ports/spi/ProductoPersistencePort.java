package org.exemple.ports.spi;

import org.exemple.data.ProductoDto;

import java.util.List;

public interface ProductoPersistencePort {
    ProductoDto addProductoDto(ProductoDto productoDto);
    ProductoDto updateProductoDto(ProductoDto productoDto);
    void deleteProductoDto(Integer id);
    List<ProductoDto> getProducts();
    ProductoDto getProductoDtoById(Integer id);
}
