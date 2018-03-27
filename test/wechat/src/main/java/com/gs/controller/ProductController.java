package com.gs.controller;

import com.gs.bean.Product;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("all")
    public List<Product> listAll() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1L, "iPhone X", "iPhone X 1", new BigDecimal(9999.0), new BigDecimal(999.99), "../../image/0001.jpg"));
        productList.add(new Product(2L, "iPhone X", "iPhone X 2", new BigDecimal(9999.0), new BigDecimal(999.99), "../../image/0002.jpg"));
        productList.add(new Product(3L, "iPhone X", "iPhone X 3", new BigDecimal(9999.0), new BigDecimal(999.99), "../../image/0003.jpg"));
        productList.add(new Product(4L, "iPhone X", "iPhone X 4", new BigDecimal(9999.0), new BigDecimal(999.99), "../../image/0005.jpg"));
        productList.add(new Product(5L, "iPhone X", "iPhone X 5", new BigDecimal(9999.0), new BigDecimal(999.99), "../../image/0006.jpg"));
        productList.add(new Product(6L, "iPhone X", "iPhone X 6", new BigDecimal(9999.0), new BigDecimal(999.99), "../../image/0007.jpg"));
        productList.add(new Product(7L, "iPhone X", "iPhone X 7", new BigDecimal(9999.0), new BigDecimal(999.99), "../../image/0009.jpg"));
        return productList;
    }

    @PostMapping("one/{id}")
    public Product getById(@PathVariable("id") Long id) {
        // 根据id查找商品信息
        System.out.println(id);
        return new Product(1L, "iPhone X", "iPhone X", new BigDecimal(9999.0), new BigDecimal(999.99), "http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg");
    }

}
