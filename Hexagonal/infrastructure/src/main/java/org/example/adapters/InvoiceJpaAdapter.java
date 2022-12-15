package org.example.adapters;

import org.example.entity.Category;
import org.example.entity.Invoice;
import org.example.entity.Producto;
import org.example.mappers.CategoryMapper;
import org.example.mappers.InvoiceMapper;
import org.example.repository.InvoiceRepository;
import org.exemple.data.CategoryDto;
import org.exemple.data.InvoiceDto;
import org.exemple.data.ProductoDto;
import org.exemple.ports.spi.InvoicePersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceJpaAdapter implements InvoicePersistencePort {


    private InvoiceRepository invoiceRepository;


    private InvoiceMapper invoiceMapper;


    @Override
    public InvoiceDto addInvoiceDto(InvoiceDto invoiceDto) {
        Invoice invoice = invoiceMapper.invoiceToInvoiceDto(invoiceDto);
        InvoiceDto invoiceDtos = invoiceMapper.invoiceDtoToInvoice(invoiceRepository.save(invoice)) ;
        return invoiceDtos;
    }

    @Override
    public InvoiceDto updateInvoiceDto(InvoiceDto invoiceDto) {
        Invoice invoice = invoiceMapper.invoiceToInvoiceDto(invoiceDto);
        InvoiceDto invoiceDtos = invoiceMapper.invoiceDtoToInvoice(invoiceRepository.save(invoice)) ;
        return invoiceDtos;

    }

    @Override
    public void deleteInvoiceDto(Integer id) {
        invoiceRepository.deleteById(String.valueOf(id));
    }

    @Override
    public List<InvoiceDto> getInvoices() {
        List<Invoice> listInvoice = invoiceRepository.findAll();
        return invoiceMapper.INSTANCE.invoiceDtoListToInvoiceList(listInvoice);

    }

    @Override
    public InvoiceDto getInvoiceDtoById(Integer id) {

        //Encuentra un registro
        Optional<Invoice> categoryId = invoiceRepository.findById(String.valueOf(id));
        if (categoryId.isPresent()) {
            return invoiceMapper.INSTANCE.invoiceDtoToInvoice(categoryId.get());
        }
        return null;
    }
}
