package ru.geekbrains.eurekaclient.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.eurekaclient.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
