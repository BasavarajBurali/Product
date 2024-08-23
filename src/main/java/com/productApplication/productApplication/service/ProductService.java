package com.productApplication.productApplication.service;

import com.productApplication.productApplication.entity.Product;
import com.productApplication.productApplication.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return productRepo.saveAll(products);
    }

    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    public Product findProductById(int id){
        return   productRepo.findById(id).orElse(null);
    }

    public Product findProductByName(String name){
        return productRepo.findByName(name);
    }

    public Product updateProduct(Product product){
        Product existingProduct=productRepo.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setId(product.getId());
        existingProduct.setPrice(product.getPrice());
        return productRepo.save(existingProduct);
    }

    public void  deleteProductById(int id){
        productRepo.deleteById(id);
    }
}
