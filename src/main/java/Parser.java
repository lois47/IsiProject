import jaxb_classes.ObjectFactory;


public class Parser {
	
	private Parser(){
		ObjectFactory ob = new  ObjectFactory();
		RulebaseType rulebase = objFact.createRulebaseType();
		JAXBElement<RulebaseType> doc = objFact.createRulebase( rulebase );
	}

}
