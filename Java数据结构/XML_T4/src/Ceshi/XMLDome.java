package Ceshi;

import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class XMLDome {
	public static void main(String[] args) {
		Element emt=new Element("XMLDome");
		emt.setAttribute("comment","introduct myXML");
		emt.addContent(new Element("name").setText("小明"));
		emt.addContent(new Element("sex").setText("男"));
		
		Element element=new Element("telephone");
		element.setText("984208452");
		emt.addContent(new Element("contact").addContent(element));
		
		
		//打印
		XMLOutputter xp=new XMLOutputter(Format.getPrettyFormat());
		String out=xp.outputString(emt);
		System.out.println(out);
	}

	
}
