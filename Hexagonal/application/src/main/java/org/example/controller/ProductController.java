package org.example.controller;
import org.exemple.data.ProductDto;
import org.exemple.data.ProductoDto;
import org.exemple.data.response.ProductoDtoResponse;
import org.exemple.ports.api.ProductServicePort;
import org.exemple.ports.api.ProductoServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServicePort productServicePort;
    @PostMapping("/create")
    public ResponseEntity<ProductDto> addProducto(@RequestBody ProductDto productoDto) {
        ProductDto productoDtoResponse = new ProductDto();
        productoDtoResponse = productServicePort.addProductDto(productoDto);
        if (productoDtoResponse != null)
            return  new ResponseEntity<ProductDto>(productoDtoResponse, HttpStatus.OK);
        else
            return   new ResponseEntity<ProductDto>(productoDtoResponse, HttpStatus.BAD_REQUEST);

    }
}
