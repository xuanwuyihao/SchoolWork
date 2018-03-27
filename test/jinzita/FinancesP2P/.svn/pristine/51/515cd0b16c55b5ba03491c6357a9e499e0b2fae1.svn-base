package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.GatheringMapper;
import com.p2p.mapper.PhotoMapper;
import com.p2p.pojo.Page;
import com.p2p.mapper.StillMapper;
import com.p2p.pojo.Fy;
import com.p2p.pojo.Gathering;
import com.p2p.pojo.Photo;
import com.p2p.pojo.Still;
import com.p2p.service.PhotoService;


@Transactional
@Service
public class PhotoServiceImpl implements PhotoService{

	
	@Resource
	private PhotoMapper photoMapper;
	
	@Resource
	private StillMapper stillMapper;
	
	@Resource
	private GatheringMapper gatheringMapper;
	
	@Override
	public List<Photo> list() {
		// TODO Auto-generated method stub
		return photoMapper.list();
	}

	@Override
	public void save(Photo t) {
		// TODO Auto-generated method stub
		photoMapper.save(t);
	}

	@Override
	public void update(Photo t) {
		// TODO Auto-generated method stub
		photoMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		photoMapper.remove(id);
	}

	@Override
	public Photo getById(Integer id) {
		// TODO Auto-generated method stub
		return photoMapper.getById(id);
	}

	@Override
	public void update1(Photo photo) {
		// TODO Auto-generated method stub
		photoMapper.update1(photo);
	}

	@Override
	public void update2(Photo photo) {
		// TODO Auto-generated method stub
		photoMapper.update2(photo);
	}

	@Override
	public List<Photo> pagingSelect(Page page) {
		// TODO Auto-generated method stub
		return photoMapper.pagingSelect(page);
	}

	@Override
	public List<Photo> lookPhoto() {
		// TODO Auto-generated method stub
		return photoMapper.lookPhoto();
	}

	@Override
	public List<Still> StList() {
		// TODO Auto-generated method stub
		return stillMapper.list();
	}

	@Override
	public List<Still> pageList(Fy f) {
		// TODO Auto-generated method stub
		return stillMapper.pageList(f);
	}

	@Override
	public Integer mhStillCount(Fy f) {
		// TODO Auto-generated method stub
		return stillMapper.mhStillCount(f);
	}

	@Override
	public List<Still> mhStillList(Fy f) {
		// TODO Auto-generated method stub
		return stillMapper.mhStillList(f);
	}

	@Override
	public List<Gathering> getGatherListByLidAndTitle(Gathering g) {
		// TODO Auto-generated method stub
		return gatheringMapper.getGatherListByLidAndTitle(g);
	}

	@Override
	public void save(Still s) {
		// TODO Auto-generated method stub
		stillMapper.save(s);
	}

	@Override
	public void saveGathering(Gathering g) {
		// TODO Auto-generated method stub
		gatheringMapper.save(g);
	}

	@Override
	public List<Gathering> GathList() {
		// TODO Auto-generated method stub
		return gatheringMapper.list2();
	}

	@Override
	public List<Still> selStillListByStatus(String staystatus) {
		// TODO Auto-generated method stub
		return stillMapper.selStillListByStatus(staystatus);
	}

	@Override
	public void updateStillByM(Still s) {
		// TODO Auto-generated method stub
		stillMapper.updateStillByM(s);
	}

	@Override
	public void updateGatheringByM(Gathering gath) {
		// TODO Auto-generated method stub
		gatheringMapper.updateGatheringByM(gath);
	}

}
