package polymorphism;

public class MethodOverloading {
	
	
	//same method name with different parameters in same or different class
	//is called Method Overloading 
	
	
	public void ArithmeticOp(int a,int b)
	{
		System.out.println("Add "+(a+b));
	}
	
	
	public void ArithmeticOp(float a,float b)
	{
		System.out.println("Add "+(a+b));
	}
	
	public void ArithmeticOp(double a,double b)
	{
		System.out.println("Add "+(a+b));
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		m.ArithmeticOp(12, 2);
		m.ArithmeticOp(12.34, 45.5);
		m.ArithmeticOp(124.4f, 56.7f);
	}

}
