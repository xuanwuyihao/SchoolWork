package Ceshi;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class DressParse {

	
	public static void main(String[] args) {
		SAXReader reader=new SAXReader();
		
		try {
			Document document=reader.read(new File("src/book.xml"));
			Element rootnode=document.getRootElement();
			Iterator it=rootnode.elementIterator();
			while(it.hasNext()){
				System.out.println("遍历某件商品");
				Element dress=(Element)it.next();
				List<Attribute> dressattr=dress.attributes();
				for(Attribute attr: dressattr){
					System.out.println("属性名："+attr.getName()+"属性值："+attr.getValue());
				}
				Iterator itt=dress.elementIterator();
				while(itt.hasNext()){
					
					Element dresschild=(Element)it.next();
					System.out.println("节点名："+dresschild.getName()+"节点值："+dresschild.getStringValue());
				}
				System.out.println("结束遍历");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
