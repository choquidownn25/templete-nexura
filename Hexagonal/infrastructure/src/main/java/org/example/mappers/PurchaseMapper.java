package org.example.mappers;

import org.example.entity.Product;
import org.example.entity.Purchase;
import org.exemple.data.ProductDto;
import org.exemple.data.PurchaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PurchaseMapper {
    PurchaseMapper INSTANCE = Mappers.getMapper(PurchaseMapper.class);
    PurchaseDto purchaseDtoToPurchase(Purchase purchase);
    Purchase purchaseToPurchaseDto(PurchaseDto purchaseDto);
    //listado
    List<PurchaseDto> purchaseDtoListToPurchaseList(List<Purchase> purchaseList);
    List<Purchase> purchaseListToPurchaseDtoList(List<PurchaseDto> purchaseDtoList);
}
