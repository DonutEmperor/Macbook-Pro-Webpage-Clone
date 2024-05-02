package dev.maxsonchen.ProductAPI.run;

public record Run(
        Integer id ,
        String title,
        String startedOn,
        String completedOn ,
        Integer miles,
        Location location
) {
}
