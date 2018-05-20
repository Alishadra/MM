package itstep;

public class Runner {

	public static void main(String[] args) {

		MathematicalManipulations mm = new MathematicalManipulations();
		System.out.println(mm.getAmount(55, 45));
		
		MathematicalManipulations mm1 = new MathematicalManipulations();
		System.out.println(mm1.getMultiplication(13, 67));
		
		MathematicalManipulations mm2 = new MathematicalManipulations();
		System.out.println(mm2.getDivision(123, 12));
		
		MathematicalManipulations mm3 = new MathematicalManipulations();
		System.out.println(mm3.getDerogation(27, 33));
		
		
	}
	
	

}
