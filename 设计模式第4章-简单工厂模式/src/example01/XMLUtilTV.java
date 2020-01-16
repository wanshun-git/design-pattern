package example01;

import java.io.*;

import javax.xml.parsers.*;

import org.w3c.dom.*;

public class XMLUtilTV {

	/**
	 * 该方法用于从XML配置文件中提取品牌名称,并返回该品牌名称
	 * @return
	 */
	public static String getBrandName() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse(new File("configTV.xml"));
			NodeList nl = doc.getElementsByTagName("brandName");
			Node classNode = nl.item(0).getFirstChild();
			String brandName = classNode.getNodeValue().trim();
			return brandName;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
