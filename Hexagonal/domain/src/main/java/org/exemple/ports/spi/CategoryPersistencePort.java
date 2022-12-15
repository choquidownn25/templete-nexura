package org.exemple.ports.spi;

import org.exemple.data.CategoryDto;
import org.exemple.data.ProductoDto;

import java.util.List;

public interface CategoryPersistencePort {
    CategoryDto addCategoryDto(CategoryDto categoryDto);
    CategoryDto updateCategoryDto(CategoryDto categoryDto);
    void deleteCategoryDto(Integer id);
    List<CategoryDto> getCategorys();
    CategoryDto getCategoryDtoById(Integer id);
}
