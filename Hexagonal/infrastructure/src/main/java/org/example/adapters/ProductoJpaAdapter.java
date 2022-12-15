package org.example.adapters;

import org.example.entity.Producto;
import org.example.mappers.ProductoMapper;
import org.example.repository.ProductoRepository;
import org.exemple.data.ProductoDto;
import org.exemple.ports.spi.ProductoPersistencePort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoJpaAdapter implements ProductoPersistencePort {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public ProductoDto addProductoDto(ProductoDto productoDto) {
        // convert DTO to Entity
        ModelMapper modelMapper = null;
        Producto postRequest = ProductoMapper.INSTANCE.productoToProductoDto(productoDto);
        Producto productoSave = productoRepository.save(postRequest);
        ProductoDto retornProductoDto = ProductoMapper.INSTANCE.productoDtoToProducto(productoSave);
        return retornProductoDto;
    }

    @Override
    public ProductoDto updateProductoDto(ProductoDto productoDto) {
        ModelMapper modelMapper = null;
        Producto postRequest = ProductoMapper.INSTANCE.productoToProductoDto(productoDto);
        Producto productoSave = productoRepository.save(postRequest);
        ProductoDto retornProductoDto = ProductoMapper.INSTANCE.productoDtoToProducto(productoSave);
        return retornProductoDto;
    }

    @Override
    public void deleteProductoDto(Integer id) {
        productoRepository.deleteById(id);
    }

    @Override
    public List<ProductoDto> getProducts() {
        //Lista todos los registros
        List<Producto> listProducts = productoRepository.findAll();
        return ProductoMapper.INSTANCE.ProductoDtoListToProductoList(listProducts);

    }

    @Override
    public ProductoDto getProductoDtoById(Integer id) {
        //Encuentra un registro
        Optional<Producto> productoId = productoRepository.findById(id);
        if (productoId.isPresent()) {
            return ProductoMapper.INSTANCE.productoDtoToProducto(productoId.get());
        }
        return null;
    }
}
