package guru.springframework.services;

import guru.springframework.entities.Product;

public interface ProductService {

    Product saveProduct(Product product);

    Product getProductById(Integer id);

    Product listAllProducts();

    void deleteProduct(Integer id);
}
