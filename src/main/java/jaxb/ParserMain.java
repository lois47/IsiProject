package jaxb;
import java.io.File;

import jaxb_classes.*;
import javax.xml.bind.*;


public class ParserMain {
	
	public static void main(String args[]){
		File fileXML = new File("../../../quiz.xml");
		try{
			JAXBContext jc = JAXBContext.newInstance("jaxb");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			unmarshaller.setValidating(true);
			
			Quiz quiz = (Quiz) unmarshaller.unmarshal(new File("test.xml"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
