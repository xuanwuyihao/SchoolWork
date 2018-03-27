package com.p2p.mapper;


import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Fuzzypaging;
import com.p2p.pojo.Media;
import com.p2p.pojo.Paging;

public interface MediaMapper extends IBaseDao<Integer, Media> {
	List<Media> meiti();
	List<Media> fuzzy(String title);
	List<Media> selpaging(Paging p);
	List<Media> fuzzypaging(Fuzzypaging f);
   
}