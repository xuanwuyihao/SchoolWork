package ht.mapper;

import java.util.List;

import bean.Finance;

public interface FinaceMapper {
	public List<Finance> financepage(String stuno,Integer offset,Integer limit);

}
