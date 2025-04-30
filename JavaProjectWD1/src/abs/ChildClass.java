package abs;

public class ChildClass extends EmpBean {

	@Override
	public void disp() {
		//
		// TODO Auto-generated method stub
		setEmpid(123);
		setEmpname("abc");
		setEmpsal(2223.5);
		
		System.out.println("EMP ID:- "+getEmpid());
		System.out.println("EMP NAME:- "+getEmpname());
		System.out.println("EMP SALARY:- "+getEmpsal());
	}

}
