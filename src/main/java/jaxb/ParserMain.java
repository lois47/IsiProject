package jaxb;
import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import jaxb_classes.*;



public class ParserMain {
	
	public static void main(String args[]){
		File fileXML = new File("../../../quiz.xml");
		try{
			JAXBContext jc = JAXBContext.newInstance("jaxb_classes");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			unmarshaller.setValidating(true);
			
			Quiz quiz = (Quiz) unmarshaller.unmarshal(fileXML);
			List question = quiz.getQuestion();
			System.out.println(question.get(1).toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
