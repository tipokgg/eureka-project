package ru.geekbrains.eurekaclient.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.eurekaclient.entity.Category;
import ru.geekbrains.eurekaclient.entity.ProductImage;
import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor
public class ProductDto {

    private Long id;
    private Category category;
    private String vendorCode;
    private List<ProductImage> images;
    private String title;
    private String shortDescription;
    private String fullDescription;
    private double price;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
