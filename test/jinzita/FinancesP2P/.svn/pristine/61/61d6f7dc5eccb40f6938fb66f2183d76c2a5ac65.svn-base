package com.p2p.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.LetterMapper;
import com.p2p.pojo.Letter;
import com.p2p.service.LetterService;

@Transactional
@Service
public class LetterServiceImpl implements LetterService{
     
	@Resource
	private LetterMapper letterMapper;
	
	@Override
	public Integer maxCount(String recipient,String status) {
		// TODO Auto-generated method stub
		return letterMapper.maxCount(recipient,status);
	}

	@Override
	public List<Letter> letter_List(Map<String, Object>map) {
		// TODO Auto-generated method stub
		return letterMapper.letter_List(map);
	}

	@Override
	public List<Letter> list() {
		// TODO Auto-generated method stub
		return letterMapper.list();
	}

	@Override
	public void save(Letter t) {
		// TODO Auto-generated method stub
		letterMapper.save(t);
	}

	@Override
	public void update(Letter t) {
		// TODO Auto-generated method stub
		letterMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		letterMapper.remove(id);
	}

	@Override
	public Letter getById(Integer id) {
		// TODO Auto-generated method stub
		return letterMapper.getById(id);
	}

	
	

}
