package com.example.demo;

import com.example.demo.repos.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testFindAllProducts(){
		Pageable pageable = PageRequest.of(0,5);
		System.out.println(productRepository.findAllStudents(pageable));
	}

}
