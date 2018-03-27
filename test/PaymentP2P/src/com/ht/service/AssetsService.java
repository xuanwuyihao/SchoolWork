package com.ht.service;

import com.ht.base.IBaseService;
import com.ht.model.Assets;


public interface AssetsService extends IBaseService<Integer,Assets>{
	
	Assets getAssetsByCustid(String custid);
	void upAssets(Assets a);
	void upAssets1(Assets a);
	void upAssets2(Assets a);

}
