package com.yh.sell.Vo;

import lombok.Data;

//http请求反悔的最外层对象

@Data
public class ResultVo<T> {

    //错误编码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;


}
