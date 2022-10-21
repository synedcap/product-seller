package com.company.prod.Controller;


import com.company.prod.Model.Category;
import com.company.prod.Model.Product;
import com.company.prod.Repository.CategoryRepository;
import com.company.prod.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {

        return productService.create(product);
    }

    @GetMapping("/list")
    public List<Product> listProduct() {
        return productService.read();
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable Long id,@RequestBody Product product) {

        return productService.update(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {

        return productService.delete(id);
    }
}
