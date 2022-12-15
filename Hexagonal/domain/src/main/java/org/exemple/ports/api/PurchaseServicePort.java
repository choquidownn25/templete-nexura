package org.exemple.ports.api;

import org.exemple.data.PurchaseDto;

import java.util.List;

public interface PurchaseServicePort {
    PurchaseDto addPurchase(PurchaseDto purchaseDto);
    PurchaseDto updatePurchase(PurchaseDto purchaseDto);
    void deletePurchase(Integer id);
    List<PurchaseDto> getPurchases();
    PurchaseDto getPurchaseById(Integer id);
}
