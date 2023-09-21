package com.reservation.item.repository;

import com.reservation.item.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

     List<Product> findProductsByAddedDateBetween(Date startDate, Date endDate);

     List<Product> findTop5ByOrderByPriceDesc();
}
