package jaxb;
import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;


import jaxb_classes.*;
import jaxb_classes.Quiz.Question;




@SuppressWarnings("restriction")
public class ParserMain {
	
	public static void main(String args[]){
		File fileXML = new File("quiz.xml");
		try{
			JAXBContext jc = JAXBContext.newInstance("jaxb_classes");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			
			Quiz quiz = (Quiz) unmarshaller.unmarshal(fileXML);
			List<Question> question = quiz.getQuestion();
			for ( int i = 0 ; i<question.size(); i++){
				System.out.println("Question numéro : " +i+ " est de type " +question.get(i).getType());
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}