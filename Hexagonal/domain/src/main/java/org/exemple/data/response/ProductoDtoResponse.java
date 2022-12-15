package org.exemple.data.response;

import lombok.*;
import org.exemple.data.ProductoDto;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProductoDtoResponse {

    private List<ProductoDto> listPrestamoDTO;
    private Message message;

}
