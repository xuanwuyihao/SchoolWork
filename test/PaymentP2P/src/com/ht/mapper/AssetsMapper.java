package com.ht.mapper;

import com.ht.base.IBaseDao;
import com.ht.model.Assets;

import com.ht.model.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetsMapper extends IBaseDao<Integer,Assets>{
	
	Assets getAssetsByCustid(String custid);
    void upAssets(Assets a);
    void upAssets1(Assets a);
    void upAssets2(Assets a);

}