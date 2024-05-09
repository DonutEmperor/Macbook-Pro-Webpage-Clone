package dev.maxsonchen.ProductAPI.appleproducts;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/macbook")
public class MacBookController {
    private final MacBookService macBookService;

    public MacBookController(MacBookService macBookService){
        this.macBookService = macBookService;
    }

    @GetMapping("/getAll")
    public List<MacBook> getAll(){
        return macBookService.getAll();
    }

    @PostMapping("/create")
    public String create(@RequestBody MacBook macBook){
        macBookService.create(macBook);
        return "MacBook Created";
    }

    @GetMapping("/find/{chip}")
    public List<MacBook> findBychip(@PathVariable String chip){
        return macBookService.findBychip(chip);
    }

    @GetMapping("/count")
    public long count(){
        return macBookService.count();
    }

}
