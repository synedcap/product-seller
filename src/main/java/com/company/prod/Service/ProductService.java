package com.company.prod.Service;


import com.company.prod.Model.Category;
import com.company.prod.Model.Product;
import com.company.prod.Repository.CategoryRepository;
import com.company.prod.Repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService  implements IProductService{

    private final ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;



    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> read() {
        return productRepository.findAll();
    }

    @Override
    public Product update(Long id, Product product) {

        return productRepository.findById(id)
                .map(p->{
                    p.setDescription(product.getDescription());
                    p.setName(product.getName());
                    p.setPrice(product.getPrice());
                    return  productRepository.save(p);

                }).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public String delete(Long id) {

        productRepository.deleteById(id);
        return "Product deleted";
    }
}
