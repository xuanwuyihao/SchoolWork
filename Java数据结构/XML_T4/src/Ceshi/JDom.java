package Ceshi;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class JDom {

	public static void main(String[] args) {
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document document=db.parse("src/book.xml");
			NodeList nodelist=document.getElementsByTagName("book");
			for (int i = 0; i < nodelist.getLength(); i++) {
				Node node=nodelist.item(i);
				NamedNodeMap map=node.getAttributes();
				for (int j = 0; j < map.getLength(); j++) {
					Node node2=map.item(j);
					System.out.println("名称是:"+node2.getNodeName());
					System.out.println("数据值是："+node2.getNodeValue());
				}
				
				NodeList list=node.getChildNodes();
				for (int k = 0; k <list.getLength() ; k++) {
					if (list.item(k).getNodeType()==Node.ELEMENT_NODE) {
						Node curr=list.item(k);
						System.out.println("第"+(k+1)+"个节点名"+list.item(k).getNodeName());
						System.out.println("节点值是"+list.item(k).getFirstChild().getNodeValue());
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
