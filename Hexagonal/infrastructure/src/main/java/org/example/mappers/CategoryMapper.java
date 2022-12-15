package org.example.mappers;

import org.example.entity.Category;
import org.example.entity.Producto;
import org.exemple.data.CategoryDto;
import org.exemple.data.ProductoDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    CategoryDto categoryDtoToCategory(Category category);
    Category categoryToCategoryDto(CategoryDto categoryDto);
    //listado
    List<CategoryDto> categoryDtoListToCategoryList(List<Category> categoryList);
    List<Category> categoryListToCategoryDtoList(List<CategoryDto> categoryDtoList);
}
