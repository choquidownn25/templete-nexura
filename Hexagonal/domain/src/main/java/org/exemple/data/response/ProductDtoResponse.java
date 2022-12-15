package org.exemple.data.response;

import lombok.*;
import org.exemple.data.ProductDto;
import org.exemple.data.ProductoDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProductDtoResponse {
    private List<ProductDto> listPrestamoDTO;
    private Message message;
}
