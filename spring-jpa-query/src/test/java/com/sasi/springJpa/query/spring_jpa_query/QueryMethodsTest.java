/**
 * @author sasi
 *
 */
package com.sasi.springJpa.query.spring_jpa_query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sasi.springJpa.query.spring_jpa_query.entity.Product;
import com.sasi.springJpa.query.spring_jpa_query.repository.querymethods.ProductRepository;

/**
 * 
 */
@SpringBootTest

public class QueryMethodsTest {

	@Autowired
	private ProductRepository productRepository;

	@Test
	void findByNameMethod() {
		Product product = productRepository.findByName("Laptop");
		System.out.println("product " + product.toString());
	}

	@Test
	void findByIdMethod() {
		Product product = productRepository.findById(3L).get();
		System.out.println("product " + product.toString());
	}

	@Test
	void findByNameOrDescriptionMethod() {

		List<Product> products = productRepository.findByNameOrDescription("product 1", "Ergonomic wireless mouse for comfortable use");

		products.forEach((p) -> {
			System.out.println(p.toString());
		});
	}

	@Test
	void findByNameAndDescriptionMethod() {
		System.out.println();
		System.out.println(" ------ findByNameAndDescriptionMethod  -------");
		List<Product> products = productRepository.findByNameAndDescription("Wireless Mouse", "Ergonomic wireless mouse for comfortable use");

		products.forEach((p) -> {
			System.out.println(p.toString());
		});
	}

	@Test
	void findDistinctByNameMethod() {
		System.out.println("");
		System.out.println("findDistinctByNameMethod");
		Product product = productRepository.findDistinctByName("Laptop");
		System.out.println(product.toString());
	}

	@Test
	void findByPriceGreaterThanMethod() {
		System.out.println("");
		System.out.println("findByPriceGreaterThanMethod");

		List<Product> products = productRepository.findByPriceGreaterThan(new BigDecimal(100));
		products.forEach((p) -> {
			System.out.println(p.toString());

		});
	}

	@Test
	void findByPriceLessThanMethod() {
		System.out.println("");
		System.out.println("findByPriceLessThanMethod");
		List<Product> products = productRepository.findByPriceLessThan(new BigDecimal(200));
		products.forEach((p) -> {
			System.out.println(p.toString());

		});
	}

	@Test
	void findByNameContainingMethod() {
		System.out.println("");
		System.out.println("findByNameContainingMethod");
		List<Product> products = productRepository.findByNameContaining("Speaker");
		products.forEach((p) -> {
			System.out.println(p.toString());

		});
	}

	@Test
	void findByNameLikeMethod() {
		System.out.println("");
		System.out.println("findByNameLikeMethod");

		List<Product> products = productRepository.findByNameLike("speaker");
		products.forEach((p) -> {
			System.out.println(p.toString());
			
		});
	}

	@Test
	void findByPriceBetweenMethod() {
		System.out.println("");
		System.out.println("findByPriceBetweenMethod");

		List<Product> products = productRepository.findByPriceBetween(new BigDecimal(100), new BigDecimal(300));

		products.forEach((p) -> {
			System.out.println(p.toString());
			
		});

	}

	@Test
	void findByDateCreatedBetweenMethod() {
		System.out.println("");
		System.out.println("findByDateCreatedBetweenMethod");


		// start date
		LocalDateTime startDate = LocalDateTime.of(2022, 02, 13, 17, 48, 33);
		// end date
		LocalDateTime endDate = LocalDateTime.of(2022, 02, 13, 18, 15, 21);

		List<Product> products = productRepository.findByDateCreatedBetween(startDate, endDate);

		products.forEach((p) -> {
			System.out.println(p.toString());
		});
	}

	@Test
	void findByNameInMethod() {
		System.out.println("");
		System.out.println("findByNameContainingMethod");

		List<Product> products = productRepository.findByNameIn(List.of("product 1", "product 2", "product 3"));
		products.forEach((p) -> {
			System.out.println(p.toString());
		});
	}

	@Test
	void findFirst2ByOrderByNameAscMethod() {
		System.out.println("");
		System.out.println("findByNameContainingMethod");

		List<Product> products = productRepository.findFirst2ByOrderByNameAsc();
		products.forEach((p) -> {
			System.out.println(p.toString());
 		});
	}

	@Test
	void findTop2ByOrderByPriceDescMethod() {
		System.out.println("");	
		System.out.println("findTop2ByOrderByPriceDescMethod");

		List<Product> products = productRepository.findTop2ByOrderByPriceDesc();
		products.forEach((p) -> {
			System.out.println(p.toString());
 		});
	}

}
