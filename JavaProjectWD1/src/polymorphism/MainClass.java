package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass cp=new ChildClass();
		//call               execute
		cp.Op();
		
		//FOR EXECUTING PARENT CLASS METHOD
		cp=new ParentClass();
		cp.Op();
	}

}
