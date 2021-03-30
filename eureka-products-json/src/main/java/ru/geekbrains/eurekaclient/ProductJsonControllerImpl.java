package ru.geekbrains.eurekaclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.eurekaclient.dto.ProductDto;
import ru.geekbrains.eurekaclient.dto.mapper.ProductDtoMapper;
import ru.geekbrains.eurekaclient.entity.Category;
import ru.geekbrains.eurekaclient.entity.Product;
import ru.geekbrains.eurekaclient.service.CategoryService;
import ru.geekbrains.eurekaclient.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductJsonControllerImpl implements ProductJsonController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;


    @Override
    public List<ProductDto> getProducts() {

        List<Product> products = productService.getAllProducts();
        List<ProductDto> result = new ArrayList<>();

        for (Product product : products) {
            ProductDto productDto = ProductDtoMapper.MAPPER.fromProduct(product);
            result.add(productDto);
        }
        return result;

    }

    @Override
    public void deleteProduct(Long id) {
        productService.deleteById(id);
    }

    @Override
    public void addProduct(ProductDto productDto) {

        Category category = categoryService.getCategoryById(1L);
        productDto.setCategory(category);

        Product product = ProductDtoMapper.MAPPER.toProduct(productDto);
        productService.saveProduct(product);

    }
}
