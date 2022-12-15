package org.exemple.ports.api;

import org.exemple.data.ProductoDto;
import org.exemple.data.response.ProductoDtoResponse;

import java.util.List;

public interface ProductoServicePort {
    ProductoDtoResponse addProductoDto(ProductoDto productoDto);
    ProductoDtoResponse updateProductoDto(ProductoDto productoDto);
    void deleteProductoDto(Integer id);
    List<ProductoDto> getProducts();
    ProductoDtoResponse getProductoDtoById(Integer id);
}
