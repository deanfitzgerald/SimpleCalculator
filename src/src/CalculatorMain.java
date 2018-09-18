//dean
public class CalculatorMain {

	public static void main(String[] args) 
	{
	Calculator calc = new Calculator();
	calc.add(2,4);
	System.out.print(calc.add(2,4));
	
	CalculatorSubtract calc1 = new CalculatorSubtract();
	calc1.sub(10,4);
	System.out.println("The difference is ");
	System.out.print(calc1.sub(10,6));
	}

}
