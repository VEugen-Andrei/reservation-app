package com.reservation.item.service;

import com.reservation.item.entity.Product;
import com.reservation.item.model.ProductDto;

import java.util.Date;
import java.util.List;

public interface ProductService {
    public List<ProductDto> getProducts();

    public ProductDto addProduct(Product product);

    public ProductDto getProductById(Long id);

    public ProductDto updateProduct(Long id, Product product);

    public ProductDto deleteProduct(Long id);

    public void deleteAll();

    public List<ProductDto> findProductsByAddedDateBetween(Date startDate, Date endDate); //Interval

    public List<ProductDto> findTop5ByOrderByPriceDesc();


}
