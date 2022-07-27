package com.example.demo.repos;

import com.example.demo.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("from Product")
    List<Product> findAllStudents(Pageable pageable);

}
