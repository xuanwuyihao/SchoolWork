package com.yh.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired GirlService girlService;

    @GetMapping("/girls")
    public List<Girl> girlList(){

        return girlRepository.findAll();
    }

    @GetMapping("/girls/two")
    public void girlTwo(){
        girlService.inserTwo();

    }
}
