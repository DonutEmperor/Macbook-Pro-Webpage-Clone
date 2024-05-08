package dev.maxsonchen.ProductAPI.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
@Entity
@Table(name="PRODUCT")
public record Product(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id,

        @NotEmpty
        String productName,

        String description,

        @Positive
        Double unitPrice,

        Double installmentPrice

) {

}
