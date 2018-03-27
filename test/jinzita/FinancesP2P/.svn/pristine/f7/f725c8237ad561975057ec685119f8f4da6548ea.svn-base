package com.p2p.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.LendApplyInfo;
import com.p2p.pojo.Page;

public interface LendApplyInfoService extends IBaseService<Integer,LendApplyInfo>{
	
	public List<LendApplyInfo> paging(Page page);
	
	public List<LendApplyInfo> selectlike();
	
	public List<LendApplyInfo> selectpeople(Page page);

	List<LendApplyInfo> selectcont(Page page);
	
	List<LendApplyInfo> username();
	
	void updatefile(LendApplyInfo len);
	
	LendApplyInfo listfile(Integer id);
	
	String oyh(Integer id);
	
	void updatestatus(LendApplyInfo len);
	
}
