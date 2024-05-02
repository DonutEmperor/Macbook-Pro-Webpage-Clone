CREATE TABLE IF NOT EXISTS product(
    id INT NOT NULL,
    product_name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    unit_price DOUBLE NOT NULL,
    installment_price DOUBLE NOT NULL,
    PRIMARY KEY (id)
);