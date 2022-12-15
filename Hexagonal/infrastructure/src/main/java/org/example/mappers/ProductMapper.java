package org.example.mappers;

import org.example.entity.Invoice;
import org.example.entity.Product;
import org.exemple.data.InvoiceDto;
import org.exemple.data.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    ProductDto productDtoToProduct(Product product);
    Product productToProductDto(ProductDto employeeDto);
    //listado
    List<ProductDto> productDtoListToProductList(List<Product> productList);
    List<Product> productListToProductDtoList(List<ProductDto> invoiceDtoList);
}
