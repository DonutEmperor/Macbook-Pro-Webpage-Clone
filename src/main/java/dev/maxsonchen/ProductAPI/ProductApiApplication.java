package dev.maxsonchen.ProductAPI;

import dev.maxsonchen.ProductAPI.product.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductApiApplication {

	private static final Logger log = LoggerFactory.getLogger(ProductApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProductApiApplication.class, args);
		log.info("Application Started Successfully!");
	}

//	@Bean
//	CommandLineRunner runner(){
//		return args -> {
//
//			Product product = new Product("8-core CPU\n" +
//					"10-core GPU\n" +
//					"8GB Unified Memory\n" +
//					"512GB SSD Storage¹" , "14-inch Liquid Retina XDR display²\n" +
//					"Two Thunderbolt / USB 4 ports, HDMI port, SDXC card slot, headphone jack, MagSafe 3 port\n" +
//					"Magic Keyboard with Touch ID\n" +
//					"Force Touch trackpad\n" +
//					"70W USB-C Power Adapter" , 7499.00 , 312.46);
//
//			log.info("Product" + product);
//		};
//	}
}
