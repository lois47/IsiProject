
import jaxb_classes.QuestiontextType;
import jaxb_classes.Quiz.Question;


public class QuestionTest extends TestCase {
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	public void testGetQuestionText(){
		Question q = new Question();
		QuestiontextType Qt = new QuestiontextType(); 
		q.setQuestiontext(Qt);
		assertEquals(q.getQuestiontext(), Qt);
	}

}
