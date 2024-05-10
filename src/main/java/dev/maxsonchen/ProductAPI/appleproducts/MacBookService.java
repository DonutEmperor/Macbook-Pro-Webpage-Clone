package dev.maxsonchen.ProductAPI.appleproducts;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MacBookService {

    private final MacBookRepo macBookrepo;

    public MacBookService(MacBookRepo macBookrepo){
        this.macBookrepo = macBookrepo;
    }

    public List<MacBook> getAll(){
        return macBookrepo.findAll();
    }

    public void create(MacBook macBook){
        macBookrepo.save(macBook);
    }

    public MacBook findByid(Integer id){
        return macBookrepo.findByid(id);
    }

    public List<MacBook> findBychip(String chip){
        return macBookrepo.findBychip(chip);
    }

    public List<MacBook> findByChipAndSize(String chip , String size){
        return macBookrepo.findByChipAndSize(chip, size);
    }

    public List<MacBook> findBysize(String size){
        return macBookrepo.findBysize(size);
    }

    public long count (){
        return macBookrepo.count();
    }

}
