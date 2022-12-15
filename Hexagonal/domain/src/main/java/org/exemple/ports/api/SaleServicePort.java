package org.exemple.ports.api;

import org.exemple.data.SaleDto;

import java.util.List;

public interface SaleServicePort {
    SaleDto addSale(SaleDto saleDto);
    SaleDto updateSale(SaleDto purchaseDto);
    void deleteSale(Integer id);
    List<SaleDto> getSaleDtos();
    SaleDto getSaleDtoById(Integer id);
}
