package org.example.adapters;


import org.example.entity.Category;
import org.example.entity.Producto;
import org.example.mappers.CategoryMapper;
import org.example.mappers.ProductoMapper;
import org.example.repository.CategoryRepository;
import org.example.repository.ProductoRepository;
import org.exemple.data.CategoryDto;
import org.exemple.data.ProductoDto;
import org.exemple.ports.spi.CategoryPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryJpaAdapter  implements CategoryPersistencePort {

    //@Autowired
    private CategoryRepository categoryRepository;
    //@Autowired
    private CategoryMapper categoryMapper;


    @Override
    public CategoryDto addCategoryDto(CategoryDto categoryDto) {
        Category category = categoryMapper.categoryToCategoryDto(categoryDto);
        CategoryDto categoryDtos = categoryMapper.categoryDtoToCategory(categoryRepository.save(category)) ;
        return categoryDtos;
    }

    @Override
    public CategoryDto updateCategoryDto(CategoryDto categoryDto) {
        Category category = categoryMapper.categoryToCategoryDto(categoryDto);
        CategoryDto categoryDtos = categoryMapper.categoryDtoToCategory(categoryRepository.save(category)) ;
        return categoryDtos;
    }

    @Override
    public void deleteCategoryDto(Integer id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<CategoryDto> getCategorys() {
        //Lista todos los registros
        List<Category> listProducts = categoryRepository.findAll();
        return CategoryMapper.INSTANCE.categoryDtoListToCategoryList(listProducts);
    }

    @Override
    public CategoryDto getCategoryDtoById(Integer id) {
        //Encuentra un registro
        Optional<Category> categoryId = categoryRepository.findById(id);
        if (categoryId.isPresent()) {
            return CategoryMapper.INSTANCE.categoryDtoToCategory(categoryId.get());
        }
        return null;
    }
}
