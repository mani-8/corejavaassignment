package BasicProgram;

abstract class Calculation
{
	private double operand1;
	
	private double operand2;
	
	
	public Calculation(double operand1, double operand2)
	{
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	
	public final double getoperand1()
	{
		return operand1;
	}
	
	
	public final double getoperand2()
	{
		return operand2;
	}

	abstract double getSolution();
}

class Addition extends Calculation
{
	
	public Addition(double operand1, double opearand2)
	{
		super(operand1, opearand2);
	}

	@Override
	final double getSolution()
	{
		return this.getoperand1() + this.getoperand2();
	}
	
}


class Substraction extends Calculation
{
	
	public Substraction(double operand1, double opearand2)
	{
		super(operand1, opearand2);
	}
	
	@Override
	final double getSolution()
	{
		return this.getoperand1() - this.getoperand2();
	}
	
}

public class Final
{
	public static void main(String[] args)
	{
		Calculation cal1 = new Addition(10, 5);
		
		Calculation cal2 = new Substraction(10, 5);
		
		System.out.println("Addtion operand 1 : "+ cal1.getoperand1());
		System.out.println("Addtion operand 2 : "+ cal1.getoperand2());
		
		System.out.println("Subtraction operand 1 : "+ cal2.getoperand1());
		System.out.println("Subtraction operand 2 : "+ cal2.getoperand2());
		
		System.out.println("Addtion of two operand : "+ cal1.getSolution());
		
		System.out.println("Subtraction of two operand: "+ cal2.getSolution());
		
	}
}
