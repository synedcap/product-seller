package com.company.prod.Service;

import com.company.prod.Model.Category;

import java.util.List;

public interface ICategoryService {


   Category create(Category category);

   List<Category> list();

   Category update(Long id, Category category);

   String delete(Long id);



}
