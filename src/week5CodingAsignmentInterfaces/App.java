package week5CodingAsignmentInterfaces;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger asteriskLogger = new AsteriskLogger();
		asteriskLogger.log("Hello");
		
		asteriskLogger.error("Hello");
		
		
		Logger SpacedLogger = new SpacedLogger();
		SpacedLogger.log("Hello");
		
		SpacedLogger.error("Hello");
	}
        

}
 