package jaxb;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import jaxb_classes.*;
import jaxb_classes.Quiz.Question;




//@SuppressWarnings("restriction")
public class ParserMain {
	
	public static void main(String args[]) {
		File fileXML = new File("quiz.xml");
		try {
			JAXBContext jc = JAXBContext.newInstance("jaxb_classes");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			Quiz quiz = (Quiz) unmarshaller.unmarshal(fileXML);
			List<Question> question = quiz.getQuestion();
			for(int i = 0; i < question.size(); i++) {
				System.out.println("Question numéro : " + i + " est de type " + question.get(i).getType());
			}
			
			File newQuiz = new File("quiz2.xml");
			if(newQuiz.exists()) newQuiz.delete();
			
			// build a new XML file
			JAXBContext jaxbContext = JAXBContext.newInstance("jaxb_classes");
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
//			Validator validator = jaxbContext.createValidator();
			marshaller.marshal(quiz, new FileOutputStream("quiz2.xml"));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}