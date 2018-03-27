package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.p2p.mapper.MediaMapper;
import com.p2p.pojo.Fuzzypaging;
import com.p2p.pojo.Media;
import com.p2p.pojo.Paging;
import com.p2p.service.MediaService;

@Service
public class MediaServiceImpl implements MediaService{

	@Resource
	private MediaMapper mediamapper;
	@Override
	public List<Media> list() {
		// TODO Auto-generated method stub
		return mediamapper.list();
	}

	@Override
	public void save(Media media) {
		// TODO Auto-generated method stub
		mediamapper.save(media);
	}

	@Override
	public void update(Media t) {
		// TODO Auto-generated method stub
		mediamapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		mediamapper.remove(id);
	}

	@Override
	public Media getById(Integer id) {
		// TODO Auto-generated method stub
		return mediamapper.getById(id);
	}

	@Override
	public List<Media> fuzzy(String title) {
		// TODO Auto-generated method stub
		return mediamapper.fuzzy(title);
	}

	@Override
	public List<Media> selpaging(Paging p) {
		// TODO Auto-generated method stub
		return  mediamapper.selpaging(p);
	}

	@Override
	public List<Media> fuzzypaging(Fuzzypaging f) {
		// TODO Auto-generated method stub
		return mediamapper.fuzzypaging(f);
	}

	@Override
	public List<Media> meiti() {
		// TODO Auto-generated method stub
		return mediamapper.meiti();
	}




	




	

}
