package ru.geekbrains.eurekaclientfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.geekbrains.eurekaclientfeign.dto.ProductDto;


import java.util.List;

@Controller
public class ProductsControllerImpl {

    @Autowired
    private ProductsController productsController;

    @GetMapping("/products")
    public String greeting(Model model) {

        List<ProductDto> list = productsController.getProducts();

        model.addAttribute("products", productsController.getProducts());
        ProductDto productDto = new ProductDto();
        model.addAttribute("product", productDto);

        return "products-page";
    }

    @PostMapping("add-product")
    public String addProduct(ProductDto productDto) {
        productsController.addProduct(productDto.getTitle());
        return "redirect:/products";
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        productsController.deleteProduct(id);

        return "redirect:/products";
    }

}
