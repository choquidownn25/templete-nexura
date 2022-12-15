package org.exemple.data.response;

import lombok.*;
import org.exemple.data.ProductoDto;
import org.exemple.data.PurchaseDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PurchaseDtoResponse {

    private List<PurchaseDto> listPurchaseDto;
    private Message message;
}
