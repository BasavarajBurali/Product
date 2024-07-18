package com.productApplication.productApplication.controller;

import com.productApplication.productApplication.entity.Product;
import com.productApplication.productApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService productService;



    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return  productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products);

    }

    @GetMapping("/getAllProducts")
    public  List<Product> getAllProduct(){
        return  productService.getProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Product productById(@PathVariable int id){
        return  productService.findProductById(id);
    }

    @GetMapping("/getProductByName/{name}")
    public  Product findByName(@PathVariable String name){
        return  productService.findProductByName(name);
    }

    @PutMapping("/updatdeProduct")
    public Product updateProduct(@RequestBody Product product){
        return  productService.updateProduct(product);
    }

    public  String deleteProduct(int id){
        productService.deleteProductById(id);
        return "deleted";
    }
}
