package dev.patika.ecommerce.business.abstracts;

import dev.patika.ecommerce.entity.Category;
import dev.patika.ecommerce.entity.Product;
import dev.patika.ecommerce.entity.Supplier;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ISupplierService {
    Supplier save(Supplier supplier);
    Supplier get(int id);
    Page<Supplier> cursor(int page, int pageSize);

    Supplier update(Supplier supplier);

    boolean delete(int id);
}
