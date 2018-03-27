package Dome;

import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class chuangjianXML {
	public static void main(String[] args) {
		Element  emt=new Element("MyInfo");
		emt.setAttribute("comment","introduce myself");
		emt.addContent(new Element("name").setText("kingwong"));
		emt.addContent(new Element("sex").setAttribute("value","male"));
		
		
		Element element=new Element("telephone");
		element.setText("97698765");
		emt.addContent(new Element("contact").addContent(element));
		
		
		//打印XML
		XMLOutputter out=new XMLOutputter(Format.getPrettyFormat());
		String op=out.outputString(emt);
		System.out.println(op);
	}
}
