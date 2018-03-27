package com.p2p.mapper;

import java.util.List;
import java.util.Map;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Letter;

public interface LetterMapper extends IBaseDao<Integer, Letter>{
	Integer maxCount(String recipient,String status);
	List<Letter> letter_List(Map<String, Object>map);
	
}