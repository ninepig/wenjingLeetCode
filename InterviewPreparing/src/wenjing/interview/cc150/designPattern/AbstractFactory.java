package wenjing.interview.cc150.designPattern;

public abstract class AbstractFactory {

	public abstract Production generateProduction();
	
	public void UsingProduction(String material){
		
		Production thisProduction = generateProduction();
		
		 thisProduction.productionUsing();
		
	}
	
}
