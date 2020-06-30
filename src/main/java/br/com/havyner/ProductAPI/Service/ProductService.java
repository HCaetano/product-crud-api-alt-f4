package br.com.havyner.ProductAPI.Service;

import br.com.havyner.ProductAPI.Entity.Product;
import br.com.havyner.ProductAPI.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional
    public Product save(Product product) {
        return repository.save(product);
    }

    @Transactional
    public Product update(Product product, Integer id) {
        product.setId(id);

        return repository.save(product);
    }

    @Transactional
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Transactional
    public Product findById(Integer id) {
        Optional<Product> product = repository.findById(id);

        return product.get();
    }

    @Transactional
    public List<Product> findAll() {
        return repository.findAll();
    }
}
