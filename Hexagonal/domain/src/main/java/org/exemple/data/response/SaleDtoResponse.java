package org.exemple.data.response;

import lombok.*;
import org.exemple.data.PurchaseDto;
import org.exemple.data.SaleDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class SaleDtoResponse {
    private List<SaleDto> listSaleDto;
    private Message message;
}
