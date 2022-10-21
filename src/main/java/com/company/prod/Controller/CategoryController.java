package com.company.prod.Controller;


import com.company.prod.Model.Category;
import com.company.prod.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public Category createCategory(@RequestBody Category category){
        return categoryService.create(category);
    }

    @GetMapping("/list")
    public List<Category> listCategory(){

        return categoryService.list();
    }

    @PutMapping("/update/{id}")
    public Category updateCategory(@PathVariable Long id,@RequestBody Category category){

        return categoryService.update(id, category);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCategory(@PathVariable Long id){
        return categoryService.delete(id);
    }
}
