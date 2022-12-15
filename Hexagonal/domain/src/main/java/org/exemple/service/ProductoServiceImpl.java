package org.exemple.service;

import org.exemple.data.ProductoDto;
import org.exemple.data.response.Message;
import org.exemple.data.response.ProductoDtoResponse;
import org.exemple.ports.api.ProductoServicePort;
import org.exemple.ports.spi.ProductoPersistencePort;
import org.exemple.utils.StringResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements ProductoServicePort {

    private ProductoPersistencePort productoPersistencePort;

    @Autowired
    public ProductoServiceImpl(ProductoPersistencePort productoPersistencePort){
        this.productoPersistencePort = productoPersistencePort;
    }
    @Override
    public ProductoDtoResponse addProductoDto(ProductoDto productoDto) {
        ProductoDtoResponse response = new ProductoDtoResponse();
        ProductoDto producto = null;
        List<ProductoDto>listPrestamoDTO = new ArrayList<>();
        Message message = new Message();
        producto = productoPersistencePort.addProductoDto(productoDto);
        if(producto==null){
            message.setEcho (StringResponse.ErrorSAVE.getName());
            message.setCode( StringResponse.ErrorSAVE.getCode());
            response.setMessage( message);
        }else{
            listPrestamoDTO.add(producto);
            message.setEcho (StringResponse.OK.getName());
            message.setCode( StringResponse.OK.getCode());
            response.setMessage( message);
            response.setListPrestamoDTO(listPrestamoDTO);
        }
        return response;
    }

    @Override
    public ProductoDtoResponse updateProductoDto(ProductoDto productoDto) {

        ProductoDtoResponse response = new ProductoDtoResponse();
        ProductoDto producto = null;
        List<ProductoDto>listPrestamoDTO = new ArrayList<>();
        Message message = new Message();
        producto = productoPersistencePort.updateProductoDto(productoDto);
        if(producto==null){
            message.setEcho (StringResponse.ErrorSAVE.getName());
            message.setCode( StringResponse.ErrorSAVE.getCode());
            response.setMessage( message);
        }else{
            listPrestamoDTO.add(producto);
            message.setEcho (StringResponse.OK.getName());
            message.setCode( StringResponse.OK.getCode());
            response.setMessage( message);
            response.setListPrestamoDTO(listPrestamoDTO);
        }
        return response;
    }

    @Override
    public void deleteProductoDto(Integer id) {
        productoPersistencePort.deleteProductoDto(id);
    }

    @Override
    public List<ProductoDto> getProducts() {
        return productoPersistencePort.getProducts();
    }

    @Override
    public ProductoDtoResponse getProductoDtoById(Integer id) {
        ProductoDtoResponse response = new ProductoDtoResponse();
        ProductoDto producto = null;
        List<ProductoDto>listPrestamoDTO = new ArrayList<>();
        Message message = new Message();
        producto = productoPersistencePort.getProductoDtoById(id);
        if(producto==null){
            message.setEcho (StringResponse.ErrorNOHAYPRODUCTO.getName());
            message.setCode( StringResponse.ErrorNOHAYPRODUCTO.getCode());
            response.setMessage( message);
        }else{
            listPrestamoDTO.add(producto);
            message.setEcho (StringResponse.OK.getName());
            message.setCode( StringResponse.OK.getCode());
            response.setMessage( message);
            response.setListPrestamoDTO(listPrestamoDTO);
        }
        return response;

    }
}
