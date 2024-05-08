package dev.maxsonchen.ProductAPI.product;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

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

    public Optional<Product> findById(Integer id){
        return jdbcClient.sql("SELECT * FROM PRODUCT WHERE id = :id")
                .param("id" , id)
                .query(Product.class)
                .optional();
    }

    public void create(Product product){
            var created = jdbcClient.sql("INSERT INTO Product (id , product_name , description , unit_price , installment_price) values (?,?,?,?,?)")
                    .params(List.of(product.id(),product.productName(), product.description(), product.unitPrice(), product.installmentPrice()))
                .update();

        Assert.state(created == 1 , "Failed to create Product" + product.productName());
    }

    public void update(Product product , Integer id){
        var updated = jdbcClient.sql("UPDATE Product set product_name = ? , description = ? , unit_price = ? , installment_price = ? WHERE id = ?")
                .params(List.of(product.productName(), product.description(), product.unitPrice(), product.installmentPrice(),product.id()))
                .update();

        Assert.state(updated == 1 , "Failed to update Product" + product.productName() + " ID: "  + id);

    }

    public void delete(Integer id){
        var deleted = jdbcClient.sql("DELETE FROM Product WHERE id = :id")
                .param("id" , id)
                .update();

        Assert.state(deleted == 1 , "Failed to delete Product" + id);
    }

    public int count (){
        return jdbcClient.sql("SELECT * FROM Product")
                .query()
                .listOfRows()
                .size();
    }
}

