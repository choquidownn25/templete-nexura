package org.exemple.data.response;

import lombok.*;
import org.exemple.data.EmployeeDto;
import org.exemple.data.InvoiceDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class InvoiceDtoResponse {
    private List<InvoiceDto> invoiceDto;
    private Message message;
}
