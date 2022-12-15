package org.exemple.ports.spi;

import org.exemple.data.CategoryDto;
import org.exemple.data.ProductoDto;
import org.exemple.data.SupplierDto;

import java.util.List;

public interface SupplierPersistencePort {
    SupplierDto addSupplierDto(SupplierDto supplierDto);
    SupplierDto updatSupplierDto(SupplierDto supplierDto);
    void deleteSupplierDto(Integer id);
    List<SupplierDto> getSuppliers();
    SupplierDto getSupplierDtoById(Integer id);
}
