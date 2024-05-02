package dev.maxsonchen.ProductAPI.product;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record Product(

        Integer id,

        @NotEmpty
        String productName,

        String description,

        @Positive
        Double unitPrice,

        Double installmentPrice

) {

}
