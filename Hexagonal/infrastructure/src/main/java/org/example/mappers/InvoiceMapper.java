package org.example.mappers;

import org.example.entity.Employee;
import org.example.entity.Invoice;
import org.exemple.data.EmployeeDto;
import org.exemple.data.InvoiceDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface InvoiceMapper {
    InvoiceMapper INSTANCE = Mappers.getMapper(InvoiceMapper.class);
    InvoiceDto invoiceDtoToInvoice(Invoice employee);
    Invoice invoiceToInvoiceDto(InvoiceDto employeeDto);
    //listado
    List<InvoiceDto> invoiceDtoListToInvoiceList(List<Invoice> invoiceList);
    List<Invoice> invoiceListToInvoiceDtoList(List<InvoiceDto> invoiceDtoList);
}
