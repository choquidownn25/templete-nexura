package org.example.mappers;

import org.example.entity.Producto;
import org.exemple.data.ProductoDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductoMapper {
    ProductoMapper INSTANCE = Mappers.getMapper(ProductoMapper.class);
    ProductoDto productoDtoToProducto(Producto product);
    Producto productoToProductoDto(ProductoDto productoDto);
    //listado
    List<ProductoDto> ProductoDtoListToProductoList(List<Producto> productoList);
    List<Producto> ProductoListToProductoDtoList(List<ProductoDto> productoDtoList);
}
