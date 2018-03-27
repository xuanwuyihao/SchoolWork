package com.ht.solr;

import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;

public class IndexSearcher {
	
	@Test
	public void sercher() throws SolrServerException {
		// 创建HttpSolrServer
		HttpSolrServer server = new HttpSolrServer("http://localhost:8080/solr");
		
		//创建solrQuery
		SolrQuery query=new SolrQuery();
		//查询条件
		query.setQuery("product_name:小黄人");
		
		//执行查询并返回结果
		QueryResponse responce= server.query(query);
		
		//获取匹配的所有结果
		SolrDocumentList list=responce.getResults();
		//结果总数
		long count= list.getNumFound();
		
		
		System.out.println("结果总数"+count);
		
		for(SolrDocument doc:list) {
			System.out.println(doc.get("id"));
			System.out.println(doc.get("product_name"));
			System.out.println(doc.get("product_price"));
			System.out.println(doc.get("product_catalog"));
			
			
		}
	}
	
	@Test
	public void search2() throws Exception { 
		// 创建HttpSolrServer
				HttpSolrServer server = new HttpSolrServer("http://localhost:8080/solr");
		//创建solrquery对象
				SolrQuery query=new SolrQuery();
				
		//插入 查询条件
				query.setQuery("product_name:小黄人");
				
		//设置过滤条件
		//如果设置多个过滤的话，需要用query.addFilterQuery(fq)
			query.setFilterQueries("product_price:[1 TO 10]");
			
		//设置排序
			query.setSort("product_price",ORDER.asc);
		//设置分页信息
			query.setStart(0);
			query.setRows(10);
			
		//设置显示的file的域集合
			query.setFields("id,product_name,product_catalog,product_price,product_picture");
			
		//设置默认域
			query.set("df", "product_keywords");
		//设置高亮信息
			query.setHighlight(true);
			query.addHighlightField("product_name");
			query.setHighlightSimplePre("<em>");
			query.setHighlightSimplePost("</em>");
			//执行查询并返回结果
			QueryResponse responce= server.query(query);
			
			//获取匹配的所有结果
			SolrDocumentList list=responce.getResults();
			//结果总数
			long count= list.getNumFound();
			
			
			System.out.println("结果总数"+count);
			
			Map<String, Map<String, List<String>>> highlighting= responce.getHighlighting();
			for(SolrDocument doc:list) {
				System.out.println(doc.get("id"));
				List<String> list2=highlighting.get(doc.get("id")).get("product_name");
				if(list2!=null) {
					System.out.println("高亮显示的商品名称："+list2.get(0));
				}else {
					System.out.println(doc.get("product_name"));
				}
				
				System.out.println(doc.get("product_name"));
				System.out.println(doc.get("product_price"));
				System.out.println(doc.get("product_catalog"));
				
				
			}
			
		
				
	}
	

}
