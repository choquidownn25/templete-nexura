package org.example.mappers;

import org.example.entity.Purchase;
import org.example.entity.Sale;
import org.exemple.data.PurchaseDto;
import org.exemple.data.SaleDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SaleMapper {
    SaleMapper INSTANCE = Mappers.getMapper(SaleMapper.class);
    SaleDto saleDtoToSale(Sale sale);
    Sale saleToSaleDto(SaleDto saleDto);
    //listado
    List<SaleDto> saleDtoListToSaleList(List<Sale> saleList);
    List<Sale> saleListToSaleDtoList(List<SaleDto> saleDtoList);
}
