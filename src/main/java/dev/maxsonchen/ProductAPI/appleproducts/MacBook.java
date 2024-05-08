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
