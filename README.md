A very good opportunity to learn Spring Boot Framework, JPA Hibernate, and Tailwind. 

# Modefair Assessment Task
Create exact replicas:
Product Selection Page: Apple MacBook Pro Purchase Page
https://www.apple.com/my/shop/buy-mac/macbook-pro 

Product Detail Page: Apple MacBook Pro 14-inch Detail Page
https://www.apple.com/my/shop/buy-mac/macbook-pro/14-inch-space-black-apple-m3-max-with-14-core-cpu-and-30-core-gpu-36gb-memory-1tb 

# Schema
Single Entity  

![Schena drawio](https://github.com/DonutEmperor/Macbook-Pro-Webpage-Clone/assets/56782553/2e969bca-4bbb-43b6-9591-99ba094ae73f)

```
package dev.maxsonchen.ProductAPI.appleproducts;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.web.bind.annotation.PostMapping;

@Entity
@Table(name="macbook")
public class MacBook{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;
        @Column
        String size;

        @Column
        String chip;

        @Column
        String color;

        @Column
        String processorTitle;

        @Column
        String specification;

        @Column
        @Positive
        Double unitPrice;

        @Column
        @Positive
        Double installmentPrice;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getSize() {
                return size;
        }

        public void setSize(String size) {
                this.size = size;
        }

        public String getChip() {
                return chip;
        }

        public void setChip(String chip) {
                this.chip = chip;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public String getProcessorTitle() {
                return processorTitle;
        }

        public void setProcessorTitle(String processorTitle) {
                this.processorTitle = processorTitle;
        }

        public String getSpecification() {
                return specification;
        }

        public void setSpecification(String specification) {
                this.specification = specification;
        }

        public Double getUnitPrice() {
                return unitPrice;
        }

        public void setUnitPrice(Double unitPrice) {
                this.unitPrice = unitPrice;
        }

        public Double getInstallmentPrice() {
                return installmentPrice;
        }

        public void setInstallmentPrice(Double installmentPrice) {
                this.installmentPrice = installmentPrice;
        }
}
```

# Product Selection Page
14-Inch
![chrome_rUnN9Y8j9V](https://github.com/DonutEmperor/Macbook-Pro-Webpage-Clone/assets/56782553/1dd378a4-bf1f-441f-bd99-d9693640965b)

16-Inch
![chrome_CvgnrCrcD6](https://github.com/DonutEmperor/Macbook-Pro-Webpage-Clone/assets/56782553/78774a75-21ab-478b-b6e0-7f780d666161)

Full-Selection Page (70% completed)
![image](https://github.com/DonutEmperor/Macbook-Pro-Webpage-Clone/assets/56782553/8fb34834-3485-4d54-94bb-4ceea9ce636f)

There are several problems which I was unable solve in time. One being:
![chrome_X96OMK5gEQ](https://github.com/DonutEmperor/Macbook-Pro-Webpage-Clone/assets/56782553/b16da306-eb28-4f1d-8d96-42229c271b65)

# Product Detail Page (10%)
Couldn't finish the frontend thus decided to try display the data instead but encountered a csrf CORB issue when attempting to display data via API Call, didn't manage to dig into it to solve it.
![image](https://github.com/DonutEmperor/Macbook-Pro-Webpage-Clone/assets/56782553/bfab3235-8f38-4a62-a0f4-f60e63cf095a) 

Note: Unfortunately, I wasn't able to polish the css to be 100% identical in time.

Very challenging and fun!

