package ru.geekbrains.eurekaclientfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.geekbrains.eurekaclientfeign.dto.ProductDto;

import java.util.List;

@FeignClient("eureka-client")
public interface ProductsController {
    @GetMapping("/get-products")
    List<ProductDto> getProducts();

    @DeleteMapping("/delete-product/{id}")
    void deleteProduct(@PathVariable Long id);

    @PostMapping("/add-product")
    void addProduct(String name);

}
