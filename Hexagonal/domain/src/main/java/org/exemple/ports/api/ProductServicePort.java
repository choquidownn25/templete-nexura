package org.exemple.ports.api;

import org.exemple.data.ProductDto;
import org.exemple.data.ProductoDto;

import java.util.List;

public interface ProductServicePort {
    ProductDto addProductDto(ProductDto productDto);
    ProductDto updateInvoiceDto(ProductDto categoryDto);
    void deleteProductDto(Integer id);
    List<ProductoDto> getProduct();
    ProductoDto getProductDtoById(Integer id);
}
