package com.yh.sell.repository;

import com.yh.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
        @Autowired
    private ProductCategoryRepository repository;

        @Test
    public void findOneTest(){
            System.out.println("dd");
            ProductCategory productCategory= repository.getOne(1);
            System.out.println(productCategory.toString());
        }

        @Test
        @Transactional
    public void saveTest(){
            ProductCategory productCategory=new ProductCategory("女生最爱",8);

            ProductCategory result=repository.save(productCategory);
            Assert.assertNotNull(result);
            //Assert.assertArrayEquals(null,result);
        }

        @Test
    public void findByCategoryTypeInTest(){
            List<Integer> list= Arrays.asList(2,3,4);

            List<ProductCategory> result=repository.findByCategoryTypeIn(list);
            Assert.assertNotEquals(0,result.size());
        }

}