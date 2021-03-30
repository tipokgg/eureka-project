package ru.geekbrains.eurekaclient;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.geekbrains.eurekaclient.dto.ProductDto;

import java.util.List;

public interface ProductJsonController {
    @GetMapping("/get-products")
    List<ProductDto> getProducts();

    @DeleteMapping("/delete-product/{id}")
    void deleteProduct(@PathVariable Long id);

    @PostMapping("/add-product")
    void addProduct(ProductDto productDto);
}
