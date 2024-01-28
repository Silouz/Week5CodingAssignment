package week5CodingAsignmentInterfaces;
//we created an AsteriskLogger class and added "implements Logger" to implement it. 
// then hover over AsteriskLogger and select 'add unimplemented method'
public class AsteriskLogger implements Logger { 
	

	@Override
	public void log(String log) {
		
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		int length = error.length() + 13;
		String square = "*".repeat(length);
		
		System.out.println(square);
		System.out.println("***Error: " + error + "***");
		System.out.println(square);
	}
	

			
	
	

}
