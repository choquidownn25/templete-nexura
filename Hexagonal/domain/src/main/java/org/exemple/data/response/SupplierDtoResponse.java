package org.exemple.data.response;

import lombok.*;
import org.exemple.data.CategoryDto;
import org.exemple.data.SupplierDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class SupplierDtoResponse {
    private List<SupplierDto> supplierDtos;
    private Message message;
}
