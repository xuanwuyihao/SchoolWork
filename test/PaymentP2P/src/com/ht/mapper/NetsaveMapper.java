package com.ht.mapper;

import com.ht.base.IBaseDao;
import com.ht.model.Merchant;
import com.ht.model.Netsave;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetsaveMapper extends IBaseDao<Integer,Netsave>{
   
	Integer getNetsaveMaxId();
}