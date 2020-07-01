package br.com.havyner.ProductAPI.Controller;

import br.com.havyner.ProductAPI.Entity.Product;
import br.com.havyner.ProductAPI.Service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/api/products")
@Api(value = "Product REST API")
public class ProductController {

    @Autowired
    ProductService service;

    @ApiOperation(value = "Adds a product to the database")
    @PostMapping
    @ResponseBody
    public Product save(@RequestBody Product product) {
        return service.save(product);
    }

    @ApiOperation(value = "Updates info about a product")
    @PutMapping(value = "/{id}")
    @ResponseBody
    public Product update(@RequestBody Product product, @PathVariable Integer id) {
        return service.update(product, id);
    }

    @ApiOperation(value = "Removes a product from the database")
    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @ApiOperation(value = "Shows all products in the database")
    @GetMapping
    @ResponseBody
    public List<Product> findAll() {
        return service.findAll();
    }

    @ApiOperation(value = "Shows a specific product, retrieved by its id")
    @GetMapping(value = "/{id}")
    @ResponseBody
    public Product findById(@PathVariable Integer id) {
        return service.findById(id);
    }
}
