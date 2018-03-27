package com.yh.sell.Controller;


import com.yh.sell.Vo.ResultVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//买家商品
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVo list(){
        ResultVo resultVo=new ResultVo();
        return resultVo;
    }
}
