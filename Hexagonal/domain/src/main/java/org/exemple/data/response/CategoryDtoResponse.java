package org.exemple.data.response;

import lombok.*;
import org.exemple.data.CategoryDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CategoryDtoResponse {
    private List<CategoryDto> categoryDtos;
    private Message message;
}
