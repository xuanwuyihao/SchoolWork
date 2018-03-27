package com.yh.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    //@Transactional:让inserTwo这个方法中要执行的操作一起成功或一起失败
    public void inserTwo(){
        Girl girl=new Girl();
        girl.setId(2);
        girl.setAge(22);
        girl.setCupSize("C");
        girlRepository.save(girl);


        Girl girl1=new Girl();
        girl1.setId(3);
        girl1.setCupSize("E");
        girl1.setAge(23);
        girlRepository.save(girl1);
    }
}
