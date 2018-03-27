package XMLDom;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class Domset {
	
	public static void main(String[] args) {
		//抽象工厂
		 //创建一个DocumentBuilderFactory的对象
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		//创建一个DocumentBuilder的对象
		try {
			 //创建DocumentBuilder对象
			DocumentBuilder db=dbf.newDocumentBuilder();
			//通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
			Document dcm=db.parse("src/book.xml");
			 //获取所有book节点的集合
			NodeList list=dcm.getElementsByTagName("book");
			 //遍历每一个book节点
			for(int i=0;i<list.getLength();i++){
			//通过 item(i)方法 获取一个book节点，nodelist的索引值从0开始
				Node book=list.item(i);
				//获取book节点的所有属性集合
				NamedNodeMap nn=book.getAttributes();
				
				//第二层循环遍历book属性
				for (int j = 0; j < nn.getLength(); j++) {
					Node nd=nn.item(j);
					//获取属性名
					System.out.println("属性名"+nd.getNodeName());
					//获取属性值
					System.out.println("属性值"+nd.getNodeValue());
				}
				
				NodeList list2=book.getChildNodes();
				//遍历childNodes获取出每个节点的名和值
				for (int k = 0; k < list2.getLength(); k++) {
					//区分出text类型的node以及element类型的node
					
					if(list2.item(k).getNodeType()==Node.ELEMENT_NODE){
						
						//获取element类型的节点的节点名
						System.out.println("第"+(k + 1)+"个节点的节点名"+list2.item(k).getNodeName());
						System.out.println("节点是"+list2.item(k).getFirstChild().getNodeValue());
					}
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
