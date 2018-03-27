package com.lucene.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.FloatField;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import com.lucene.dao.BookDao;
import com.lucene.dao.impl.BookDaoImpl;
import com.lucene.po.Book;

public class IndexManager {
	
	

	@Test
	public void createIndex() throws IOException{
		//采集数据
		BookDao dao=new 	BookDaoImpl();
		List<Book> list=dao.queryBooks();
		
		//将采集到的数据封装到Document中
		List<Document> doclist=new ArrayList<>();
		Document document;
		for(Book book:list) {
			document=new Document();
			//store:如果是yes ，则说明存储到文档域中
			//图书id
			//不分词，索引，存储stringfield
			Field id=new StringField("id", book.getId().toString(), Store.YES);
			//图书名称
			//分词。索引，存储textfield
			Field name = new TextField("name", book.getName(), Store.YES);	
			//图书图片地址
			//不分词，不索引，存储
			Field pic=new StoredField("pic", book.getPic());
			//图书价格
			//分词，索引，存储floatfield
			Field price=new FloatField("price", book.getPrice(), Store.YES);
			//图书说明
			//分词，索引，存储
			Field description = new TextField("description",
					book.getDescription(), Store.NO);
			
			// 设置boost值
						if (book.getId() == 4)description.setBoost(100f);
			
			//将field域设置到Document中
			document.add(id);
			document.add(name);
			document.add(pic);
			document.add(price);
			document.add(description);
			
			doclist.add(document);
			
			
		}
		
		//创建分词器(标准分词器)
		// Analyzer analyzer = new StandardAnalyzer();
		// 使用ikanalyzer(中文分词器)
		//Analyzer analyzer=new StandardAnalyzer();
		Analyzer analyzer=new IKAnalyzer();
		
		//创建indexwriter
		IndexWriterConfig cfg=new IndexWriterConfig(Version.LUCENE_4_10_3, analyzer);
		
		
		// 指定索引库的地址
		File indexfile=new File("E:\\Lucene");
		Directory directory=FSDirectory.open(indexfile);
		IndexWriter writer=new IndexWriter(directory,cfg);
		
		//通过indexwriter将document写入索引库中
		for(Document doc:doclist) {
			writer.addDocument(doc);
		}
		
		//关闭writer
		writer.close();
	}
	
	//---------删除------------
	@Test
	public void deleteIndex() throws Exception {
		//创建分词器，标准分词器
		Analyzer analyzer=new StandardAnalyzer();
		//创建indexwriter
		IndexWriterConfig cfg=new IndexWriterConfig(Version.LUCENE_4_10_3, analyzer);
		Directory directory=FSDirectory.open(new File("E:\\Lucene"));
		IndexWriter writer=new IndexWriter(directory,cfg);
		
		//writer.deleteDocuments(new Term("id","1"));
		//删除全部
		writer.deleteAll();
		writer.close();
	}
	
	//---------修改------------
		@Test
		public void upIndex() throws Exception {
			//创建分词器，标准分词器
			Analyzer analyzer=new StandardAnalyzer();
			//创建indexwriter
			IndexWriterConfig cfg=new IndexWriterConfig(Version.LUCENE_4_10_3, analyzer);
			Directory directory=FSDirectory.open(new File("E:\\Lucene"));
			IndexWriter writer=new IndexWriter(directory,cfg);
			
			// 第一个参数：指定查询条件
			// 第二个参数：修改之后的对象
			// 修改时如果根据查询条件，可以查询出结果，则将以前的删掉，然后覆盖新的Document对象，如果没有查询出结果，则新增一个Document
			// 修改流程即：先查询，再删除，在添加
			Document doc=new Document();
			doc.add(new TextField("name","lisi",Store.YES ));
			writer.updateDocument(new Term("name","zhangsan"), doc);
			writer.close();
		}
}
