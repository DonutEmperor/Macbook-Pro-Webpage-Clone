package dev.maxsonchen.ProductAPI.appleproducts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MacBookRepo extends JpaRepository<MacBook , Integer> {

    List<MacBook> findBychip(String chip);

}
