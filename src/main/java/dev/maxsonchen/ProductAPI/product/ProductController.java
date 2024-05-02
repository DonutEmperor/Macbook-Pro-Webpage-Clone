package dev.maxsonchen.ProductAPI.product;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    //Get
    @GetMapping({""})
    List<Product> findAll(){
        return productRepository.findAll();
    }
//
//    //Get By ID
//    @GetMapping("/{id}")
//    Product findById(@PathVariable Integer id){
//        Optional<Product> product = productRepository.findById(id);
//        if(product.isEmpty()){
//            throw new ProductNotFoundException();
//        }
//        return product.get();
//    }
//
//    //Create
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/create")
//    void create(@Valid @RequestBody Product product){
//        productRepository.create(product);
//    }
//
//    //Update
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @PutMapping("/put/{id}")
//    void put(@Valid @RequestBody Product product , @PathVariable Integer id){
//        productRepository.update(product, id);
//    }
//
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @DeleteMapping("/delete/{id}")
//    void delete(@PathVariable Integer id){
//        productRepository.delete(id);
//    }

}
