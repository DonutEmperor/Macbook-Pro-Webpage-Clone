package dev.maxsonchen.ProductAPI.appleproducts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MacBookRepo extends JpaRepository<MacBook , Integer> {

    @Query("SELECT m FROM MacBook m WHERE m.chip = :chip AND m.size = :size")
    List<MacBook> findByChipAndSize(@Param("chip") String chip, @Param("size") String size);

    List<MacBook> findBychip(String chip);

    MacBook findByid(Integer id);

    List<MacBook> findBysize(String size);

}
