package com.yh.sell.repository;

import com.yh.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo ,String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
