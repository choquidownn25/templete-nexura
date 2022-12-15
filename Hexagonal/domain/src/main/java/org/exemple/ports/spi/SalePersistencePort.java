package org.exemple.ports.spi;

import org.exemple.data.SaleDto;
import java.util.List;

public interface SalePersistencePort {
    SaleDto addSale(SaleDto saleDto);
    SaleDto updateSale(SaleDto purchaseDto);
    void deleteSale(Integer id);
    List<SaleDto> getSaleDtos();
    SaleDto getSaleDtoById(Integer id);
}
