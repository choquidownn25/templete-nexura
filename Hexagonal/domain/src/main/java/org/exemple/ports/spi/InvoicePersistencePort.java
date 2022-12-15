package org.exemple.ports.spi;

import org.exemple.data.CategoryDto;
import org.exemple.data.InvoiceDto;
import org.exemple.data.ProductoDto;

import java.util.List;

public interface InvoicePersistencePort {
    InvoiceDto addInvoiceDto(InvoiceDto invoiceDto);
    InvoiceDto updateInvoiceDto(InvoiceDto invoiceDto);
    void deleteInvoiceDto(Integer id);
    List<InvoiceDto> getInvoices();
    InvoiceDto getInvoiceDtoById(Integer id);
}
