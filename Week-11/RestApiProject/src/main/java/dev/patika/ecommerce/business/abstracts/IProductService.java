package dev.patika.ecommerce.business.abstracts;

import dev.patika.ecommerce.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IProductService {
    Product save(Product product);
    Product get(int id);
    Page<Product> cursor(int page, int pageSize);
    Product update(Product product);
    boolean delete(int id);
    List<Product> findByName(String name);
}
