package org.exemple.ports.spi;

import org.exemple.data.ProductDto;
import org.exemple.data.ProductoDto;
import org.exemple.data.PurchaseDto;

import java.util.List;

public interface PurchasePersistencePort {
    PurchaseDto addPurchase(PurchaseDto purchaseDto);
    PurchaseDto updatePurchase(PurchaseDto purchaseDto);
    void deletePurchase(Integer id);
    List<PurchaseDto> getPurchases();
    PurchaseDto getPurchaseById(Integer id);
}
