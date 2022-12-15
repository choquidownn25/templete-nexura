package org.exemple.ports.api;

import org.exemple.data.CategoryDto;
import org.exemple.data.ProductoDto;

import java.util.List;

public interface CategoryServicePort {
    CategoryDto addCategoryDto(CategoryDto categoryDto);
    CategoryDto updateCategoryDto(CategoryDto categoryDto);
    void deleteCategoryDto(Integer id);
    List<ProductoDto> getCategorys();
    ProductoDto getCategoryDtoById(Integer id);
}
