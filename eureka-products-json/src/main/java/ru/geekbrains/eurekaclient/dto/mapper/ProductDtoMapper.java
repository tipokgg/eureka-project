package ru.geekbrains.eurekaclient.dto.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.geekbrains.eurekaclient.dto.ProductDto;
import ru.geekbrains.eurekaclient.entity.Product;

@Mapper
public interface ProductDtoMapper {

    ProductDtoMapper MAPPER = Mappers.getMapper(ProductDtoMapper.class);

    Product toProduct(ProductDto product);

    @InheritInverseConfiguration
    ProductDto fromProduct(Product product);
}
