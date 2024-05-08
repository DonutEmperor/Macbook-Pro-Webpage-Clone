package dev.maxsonchen.ProductAPI.product;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class ProductJsonDataLoader implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ProductJsonDataLoader.class);
    private final ProductRepository productRepository;
    private final ObjectMapper objectMapper;

    public ProductJsonDataLoader(ProductRepository productRepository , ObjectMapper objectMapper) {
        this.productRepository = productRepository;
        this.objectMapper = objectMapper;
    }
    @Override
    public void run(String... args) throws Exception {
        if(productRepository.count() == 0){

        }
    }
}
