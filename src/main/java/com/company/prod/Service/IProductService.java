package com.company.prod.Service;

import com.company.prod.Model.Product;

import java.util.List;

public interface IProductService {

    Product create(Product product);

    List<Product> read();

    Product update(Long id, Product product);

    String delete(Long id);
}
