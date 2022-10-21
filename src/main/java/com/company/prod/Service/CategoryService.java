package com.company.prod.Service;

import com.company.prod.Model.Category;
import com.company.prod.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService  implements  ICategoryService{

    @Autowired
     CategoryRepository categoryRepository;


    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }


    @Override
    public List<Category> list() {
        return categoryRepository.findAll();
    }

    @Override
    public Category update(Long id, Category category) {


        return categoryRepository.findById(id)
                .map(c -> {
                    c.setName(category.getName());
                    return categoryRepository.save(c);
                }).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public String delete(Long id) {
        categoryRepository.deleteById(id);
        return "Category deleted";
    }
}
