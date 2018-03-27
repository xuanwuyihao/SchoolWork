package com.jd.service;

import org.apache.commons.lang.StringUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.impl.HttpSolrServer;

import com.jd.po.ResultModel;

public class ProductServiceImpl implements ProductService {
	
	//依赖注入httpSolrServer
	private HttpSolrServer server;

	@Override
	public ResultModel getProdocts(String querystring, String catalogName, String price, String sort, Integer page)
			throws Exception {
		// 创建solrquery对象
		SolrQuery query=new SolrQuery();
		
		//输入关键字
		if(StringUtils.isNotEmpty(querystring)) {
			query.setQuery(querystring);
		}else {
			query.setQuery("*:*");
		}
		
		//输入商品过滤条件
		if(StringUtils.isNotEmpty(catalogName)) {
			query.addFilterQuery("product_catalog_name:"+catalogName);
		}
		
		//输入价格区间过滤条件
		//假设price的值0-9  10-19
		if(StringUtils.isNotEmpty(price)) {
			String[] ss=price.split("-");
			query.addFilterQuery("product_price:["+ss[0]+"TO	"+ss[1]);
		}
		
		//设置排序
		if("1".equals(sort)) {
			query.setSort("product_price",ORDER.desc);
		}else {
			query.setSort("product_price",ORDER.asc);
		}
		
		//设置分页信息
		if(page==null) {
			page=1;
			query.setStart((page-1) *20);
			query.setRows(20);
		}
		
		//设置默认域
		query.set("df", "product_keywords");
		
		//设置高亮信息
		
		
		return null;
	}

}
