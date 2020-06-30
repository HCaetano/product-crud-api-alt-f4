package br.com.havyner.ProductAPI.Controller;

import br.com.havyner.ProductAPI.Entity.Product;
import br.com.havyner.ProductAPI.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping
    @ResponseBody
    public Product save(@RequestBody Product product) {
        return service.save(product);
    }

    @PutMapping(value = "/{id}")
    @ResponseBody
    public Product update(@RequestBody Product product, @PathVariable Integer id) {
        return service.update(product, id);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @GetMapping
    @ResponseBody
    public List<Product> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public Product findById(@PathVariable Integer id) {
        return service.findById(id);
    }
}
