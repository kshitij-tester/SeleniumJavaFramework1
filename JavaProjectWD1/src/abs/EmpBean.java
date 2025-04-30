package abs;

public abstract class EmpBean {
	
	
	//Abstract class will always be the parent class 
	//Abstract class will never have java main method
	//Only in abstract class, we can define abstract method
	//Abstract class is denoted by the keyword abstract 
	
	
	protected int empid;
	protected String empname;
	protected double empsal;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	
	
	public abstract void disp(); //concrete method 
	
	//Method which is defined in abstract class with its abstract keyword
	//is called concrete method 
	
	
	
	
	
	
	

}
