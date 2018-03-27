package com.lucene.action;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.NumericRangeQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;

public class IndexSearch {
	
	private void doSearch(Query query) {
			try {
				//创建indexsearcher

					File indexfile=new File("E:\\Lucene");
					Directory directory=FSDirectory.open(indexfile);
					IndexReader reader=DirectoryReader.open(directory);
					IndexSearcher searcher=new IndexSearcher(reader);
					
					//通过sercher来搜索索引库
					//参数：指定要显示的顶部记录的N条
					TopDocs docs=searcher.search(query, 10);
					
					//根据查询条件匹配出记录总数
					int count=docs.totalHits;
					System.out.println("总数:"+count);
					//根据查询条件匹配出记录
					ScoreDoc[] scordocs= docs.scoreDocs;
					System.out.println("-----");
					for(ScoreDoc scoredoc:scordocs) {
						//获取文档id
						int docid=scoredoc.doc;
						
						//通过id获取文档
						Document doc=searcher.doc(docid);
						System.out.println("商品id："+doc.get("id"));
						System.out.println("商品名称："+doc.get("name"));
						System.out.println("商品价格："+doc.get("price"));
						System.out.println("商品图片地址："+doc.get("pic"));
						System.out.println("商品说明："+doc.get("description"));
						
					}
					//关闭资源
					reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	@Test
	public void indexSearch() throws Exception {
		//创建query对象
		//使用QueryParser搜索时分词器必须一致
		//第一个参数：默认搜索域的名称
		QueryParser parser=new QueryParser("name", new StandardAnalyzer());
		//通过queryparser来创建query对象
		//参数：输入Lucene的查询语句(关键字一定要大写	)
		Query query =parser.parse("name:a AND b");
		
		doSearch(query);
	}
	
	//-------term范围-------
	@Test
	public void termQuery() {
		//创建TermQuery对象
		Query query=new TermQuery(new Term("name","b"));
		
		doSearch(query);
	}
	
	//----数字范围-----
	@Test
	public void numericRangeQuery() {
		//创建numericRangeQuery对象
		Query query =NumericRangeQuery.newFloatRange("price",0f, 50f, true , true);
	
		doSearch(query);
	}
	
	//-----boolean范围------
	public void booleanQuery() {
		BooleanQuery query = new BooleanQuery();
		// 创建TermQuery对象
		Query qu = new TermQuery(new Term("name", "b"));
		// 创建NumericRangeQuery对象
		// 参数：域的名称、最小值、最大值、是否包含最小值、是否包含最大值
		Query que = NumericRangeQuery.newFloatRange("price", 1f, 60f, true,
				false);
		
		// 组合关系代表的意思如下:
		// 1、MUST和MUST表示“与”的关系，即“交集”。
		// 2、MUST和MUST_NOT前者包含后者不包含。
		// 3、MUST_NOT和MUST_NOT没意义
		// 4、SHOULD与MUST表示MUST，SHOULD失去意义；
		// 5、SHOUlD与MUST_NOT相当于MUST与MUST_NOT。
		// 6、SHOULD与SHOULD表示“或”的概念。
		query.add(qu,Occur.SHOULD);
		query.add(que,Occur.SHOULD);
		
		doSearch(query);
	}
	
	//------搜索多个域----
	@Test
	public void multifileldQueryparser() throws ParseException {
		//创建multifileldQueryparser
		//默认搜索多个域
		String[] fields= {"name","description"};
		Analyzer analyzer=new StandardAnalyzer();
		
		//设置boosts值（搜索出的name中有b的优先）
		Map<String, Float> boosts=new HashMap<>();
		boosts.put("name", 100f);
		MultiFieldQueryParser queryParser=new MultiFieldQueryParser(fields, analyzer,boosts);
		
		Query query=queryParser.parse("b");
		
		doSearch(query);
	}

}
