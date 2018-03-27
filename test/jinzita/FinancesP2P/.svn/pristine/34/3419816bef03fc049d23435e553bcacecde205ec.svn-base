package com.p2p.mapper;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.LendApplyInfo;
import com.p2p.pojo.Page;
import com.p2p.pojo.UserInfo;

public interface LendApplyInfoMapper extends IBaseDao<Integer, LendApplyInfo> {

	//<!-- 查询所有数据带分页 -->
	List<LendApplyInfo> paging(Page page);

	//<!-- 模糊查所有 -->
	List<LendApplyInfo> selectlike();
	
	//<!-- 模糊分页 -->
	List<LendApplyInfo> selectpeople(Page page);
   
	//<!-- 模糊查所有 带参数-->
	List<LendApplyInfo> selectcont(Page page);

	List<LendApplyInfo> username();
	
	//修改文件上传
	void updatefile(LendApplyInfo len);

	LendApplyInfo listfile(Integer id);

	String oyh(Integer id);

	void updatestatus(LendApplyInfo len);

	Map<String, Object> uploadTest(MultipartFile file, HttpServletRequest request);
	
}