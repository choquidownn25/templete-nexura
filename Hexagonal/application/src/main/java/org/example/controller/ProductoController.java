package org.example.controller;

import org.exemple.data.ProductoDto;
import org.exemple.data.response.ProductoDtoResponse;
import org.exemple.ports.api.ProductoServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoServicePort productoServicePort;

    @PostMapping("/add")
    public ResponseEntity<ProductoDtoResponse> addProducto(@RequestBody ProductoDto productoDto) {
        ProductoDtoResponse productoDtoResponse = new ProductoDtoResponse();
        productoDtoResponse = productoServicePort.addProductoDto(productoDto);
        if (productoDtoResponse != null)
            return  new ResponseEntity<ProductoDtoResponse>(productoDtoResponse, HttpStatus.OK);
        else
            return   new ResponseEntity<ProductoDtoResponse>(productoDtoResponse, HttpStatus.BAD_REQUEST);

    }

    @PostMapping("/update")
    public ResponseEntity<ProductoDtoResponse>  updateProducto(@RequestBody ProductoDto productoDto) {
        ProductoDtoResponse productoDtoResponse = new ProductoDtoResponse();
        productoDtoResponse = productoServicePort.updateProductoDto(productoDto);
        if (productoDtoResponse != null)
            return   new ResponseEntity<ProductoDtoResponse>(productoDtoResponse, HttpStatus.OK);
        else
            return  new ResponseEntity<ProductoDtoResponse>(productoDtoResponse, HttpStatus.BAD_REQUEST);

    }
    @GetMapping("/get")
    public  ResponseEntity<List<ProductoDto>> getProducts() {
        List<ProductoDto> productoDtoResponse = new ArrayList<>();
        productoDtoResponse = productoServicePort.getProducts();
        if (productoDtoResponse != null)
            return  new ResponseEntity<List<ProductoDto>>(productoDtoResponse, HttpStatus.OK);
        else
            return   new ResponseEntity<List<ProductoDto>>(productoDtoResponse, HttpStatus.BAD_REQUEST);

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ProductoDtoResponse> getProductByID(@PathVariable Integer id) {
        ProductoDtoResponse productoDtoResponse = new ProductoDtoResponse();
        productoDtoResponse = productoServicePort.getProductoDtoById(id);
        if (productoDtoResponse != null)
            return   new ResponseEntity<ProductoDtoResponse>(productoDtoResponse, HttpStatus.OK);
        else
            return  new ResponseEntity<ProductoDtoResponse>(productoDtoResponse, HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProductByID(@PathVariable Integer id) {
        productoServicePort.deleteProductoDto(id);
    }


}
