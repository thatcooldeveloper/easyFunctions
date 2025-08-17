package easyFunctions;

public class demo {
    public static void main(String[] args) {
        ecfx.print("Initializing", false);
    	for (int i = 0; i < 3; i++) {
			ecfx.print(".", false);
			ecfx.delay(1000);
		}
    	ecfx.beep(2);
    	ecfx.leaveLine(5);
        ecfx.print("'The one and only...'", true);
    	ecfx.info();
        ecfx.java();
        ecfx.exit();
    }
}
//************************************************************************************************************************************************************************************************