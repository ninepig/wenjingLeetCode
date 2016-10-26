package wenjing.interview.cc150.designPattern;

public class MyProductionFactory extends AbstractFactory {

	@Override
	public Production generateProduction() {
		// TODO Auto-generated method stub
		return new MyProduction();
	}

	
	
}
