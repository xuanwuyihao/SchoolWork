package com.jd.service;

import com.jd.po.ResultModel;

public interface ProductService {
	
	public ResultModel getProdocts(String querystring,String catalogName,
			String price,String sort,Integer pagef) throws Exception;
	

}
