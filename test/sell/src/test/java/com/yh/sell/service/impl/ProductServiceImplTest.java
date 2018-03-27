package com.yh.sell.service.impl;

import com.yh.sell.dataobject.ProductInfo;
import com.yh.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productServic;

    @Test
    public void findOne() {
        ProductInfo productInfo=productServic.findOne("1");
        Assert.assertEquals("1",productInfo.getProductId());

    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList=productServic.findUpAll();
        Assert.assertNotEquals("0",productInfoList.size());
    }

    @Test
    public void findAll() {
        Pageable request=new PageRequest(0,2);
        Page<ProductInfo> productInfoPage=productServic.findAll(request);
        //System.out.println( productInfoPage.getTotalElements());
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("虾");
        productInfo.setProductIcon("http://xxx.jsp");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);
        ProductInfo result=productServic.save(productInfo);
        Assert.assertNotNull(result);
    }
}