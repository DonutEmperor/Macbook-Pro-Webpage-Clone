package dev.maxsonchen.ProductAPI.product;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    private static final Logger log = LoggerFactory.getLogger(ProductRepository.class);
    private final JdbcClient jdbcClient;

    public ProductRepository(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }

    public List<Product> findAll(){
        return jdbcClient.sql("SELECT * FROM PRODUCT")
                .query(Product.class)
                .list();
    }

    Optional<Product> findById(Integer id){
        return jdbcClient.sql("SELECT * FROM PRODUCT WHERE id = :id")
                .param("id" , id)
                .query(Product.class)
                .optional();
    }

//    private List <Product> products = new ArrayList<>();

//    List<Product> findAll(){
//        return products;
//    }
//
//    Optional<Product> findById(Integer id){
//        return products.stream()
//                .filter(product -> product.id() == id)
//                .findFirst();
//    }
//
//    void create(Product product){
//        products.add(product);
//    }
//
//
//    void update(Product product , Integer id){
//        Optional<Product> existingProduct = findById(id);
//        if(existingProduct.isPresent()){
//            products.set(products.indexOf(existingProduct.get()) , product);
//        }
//    }
//
//    void delete(Integer id){
//        products.removeIf(product -> product.id().equals(id));
//    }
//
//    @PostConstruct
//    private void init(){
//        products.add(new Product(01,
//                "8-core CPU\n" +
//                        "10-core GPU\n" +
//                        "8GB Unified Memory\n" +
//                        "512GB SSD Storage¹" , "14-inch Liquid Retina XDR display²\n" +
//                "Two Thunderbolt / USB 4 ports, HDMI port, SDXC card slot, headphone jack, MagSafe 3 port\n" +
//                "Magic Keyboard with Touch ID\n" +
//                "Force Touch trackpad\n" +
//                "70W USB-C Power Adapter" , 7499.00 , 312.46
//        ));
//
//        products.add(new Product(02,
//                "8-core CPU\n" +
//                        "10-core GPU\n" +
//                        "8GB Unified Memory\n" +
//                        "1TB SSD Storage¹" , "14-inch Liquid Retina XDR display²\n" +
//                "Two Thunderbolt / USB 4 ports, HDMI port, SDXC card slot, headphone jack, MagSafe 3 port\n" +
//                "Magic Keyboard with Touch ID\n" +
//                "Force Touch trackpad\n" +
//                "70W USB-C Power Adapter" , 8299.00 , 345.79
//        ));
//
//        products.add(new Product(03,
//                "8-core CPU\n" +
//                        "10-core GPU\n" +
//                        "16GB Unified Memory\n" +
//                        "1TB SSD Storage¹" , "14-inch Liquid Retina XDR display²\n" +
//                "Two Thunderbolt / USB 4 ports, HDMI port, SDXC card slot, headphone jack, MagSafe 3 port\n" +
//                "Magic Keyboard with Touch ID\n" +
//                "Force Touch trackpad\n" +
//                "70W USB-C Power Adapter" , 9099.00 , 379.13
//        ));
//    }
}

