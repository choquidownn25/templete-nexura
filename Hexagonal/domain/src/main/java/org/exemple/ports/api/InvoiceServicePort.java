package org.exemple.ports.api;

import org.exemple.data.InvoiceDto;
import org.exemple.data.ProductoDto;

import java.util.List;

public interface InvoiceServicePort {
    InvoiceDto addInvoiceDto(InvoiceDto categoryDto);
    InvoiceDto updateInvoiceDto(InvoiceDto categoryDto);
    void deleteInvoiceDto(Integer id);
    List<ProductoDto> getInvoices();
    ProductoDto getInvoiceDtoById(Integer id);
}
