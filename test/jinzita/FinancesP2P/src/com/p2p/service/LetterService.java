package com.p2p.service;

import java.util.List;
import java.util.Map;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.Letter;
import com.p2p.pojo.Test;

public interface LetterService extends IBaseService<Integer, Letter>{
	Integer maxCount(String sender,String status);
	List<Letter> letter_List(Map<String, Object>map);
	
}
