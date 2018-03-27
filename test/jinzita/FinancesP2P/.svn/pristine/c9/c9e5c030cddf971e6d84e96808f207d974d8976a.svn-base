package com.p2p.service;

import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.Page;
import com.p2p.pojo.Fy;
import com.p2p.pojo.Gathering;
import com.p2p.pojo.Photo;
import com.p2p.pojo.Still;

public interface PhotoService extends IBaseService<Integer,Photo>{
	
	void update1(Photo photo);
	void update2(Photo photo);
	List<Photo> pagingSelect(Page page);
	//前台轮播图显示
	List<Photo> lookPhoto();
	List<Still> StList();
	List<Still> pageList(Fy f);
    Integer mhStillCount(Fy f);//模糊查询个数
	List<Still> mhStillList(Fy f);//模糊查询
	void save(Still s);
	void saveGathering(Gathering g);
	
	List<Gathering> getGatherListByLidAndTitle(Gathering g);//查询还款表
	List<Gathering> GathList();//查询所有还款表
	List<Still> selStillListByStatus(String staystatus);
	void updateStillByM(Still s);
	void updateGatheringByM(Gathering gath);
}
