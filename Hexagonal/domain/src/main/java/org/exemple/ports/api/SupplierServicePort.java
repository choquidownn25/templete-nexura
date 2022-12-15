package org.exemple.ports.api;

import org.exemple.data.ProductoDto;
import org.exemple.data.SupplierDto;

import java.util.List;

public interface SupplierServicePort {
    SupplierDto addSupplierDto(SupplierDto supplierDto);
    SupplierDto updatSupplierDto(SupplierDto supplierDto);
    void deleteSupplierDto(Integer id);
    List<ProductoDto> getSuppliers();
    ProductoDto getSupplierDtoById(Integer id);
}
