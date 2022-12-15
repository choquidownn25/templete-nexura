package org.example.mappers;

import org.example.entity.Sale;
import org.example.entity.Supplier;
import org.exemple.data.SaleDto;
import org.exemple.data.SupplierDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SupplierMapper {
    SupplierMapper INSTANCE = Mappers.getMapper(SupplierMapper.class);
    SupplierDto supplierDtoToSupplier(Supplier supplier);
    Supplier supplierToSupplierDto(SupplierDto supplierDto);
    //listado
    List<SupplierDto> supplierDtoListToSupplierList(List<Supplier> supplierList);
    List<Supplier> supplierListToSupplierDtoList(List<SupplierDto> supplierDtoList);
}
