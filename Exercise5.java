public class Exercise5 {
	
	private final String numberRegExp = "\\A[0-9]+\\Z";
	private final String hexNumberRegExp = "\\A0x[0-9A-F]+\\Z";
	private final String hexPrefix = "0x";
	//
	private final String decimalNumberPrompt = "Please enter a decimal number > ";
	private final String hexadecimalNumberPrompt = "Please enter a hexadecimal number (0xnnnn) > ";
	private final String successMessageFormat = "\n\t %s equals %s\n";
	private final String errorMessageFormat = "\n\t %s is not a %s\n";
	//
	
			
	public static void main(String[] args) {
		
		new Exercise5().exercise5Runner();
	}
	
	private void exercise5Runner() {
		
		boolean running = true;
			while (running) {
			System.out.println("What would you like to convert?");
			System.out.println("1 - Decimal to Hexadecimal");
			System.out.println("2 - Hexadecimal to Decimal");
			System.out.println("0 - Exit");
			String str = System.console().readLine();
			int option = Integer.parseInt(str);  
			switch (option) {
			case 0: 
				running = false;
				break;
			case 1: 
				System.out.print(decimalNumberPrompt);
				str = System.console().readLine();  
				convertDecimal(str);				
				break;
			case 2: 
				System.out.print(hexadecimalNumberPrompt);
				str = System.console().readLine();  
				convertHexadecimal(str);
				break;
			default: 
				System.out.println( "Invalid option. Please try again.");
			}	
		}
	}
	
	private boolean testStringAsNumber(String stringToTest, String regExpTest) {
		
		return stringToTest != null && stringToTest.matches(regExpTest);
	}
		
	private void convertDecimal(String stringToConvert) {
		
		if (!testStringAsNumber(stringToConvert, numberRegExp)) {
			System.out.println(String.format(errorMessageFormat, stringToConvert, "decimal number"));
			return;
		}
		String hexValue = Integer.toHexString(Integer.parseInt(stringToConvert));
		System.out.println(String.format(successMessageFormat, stringToConvert, (hexPrefix + hexValue)));
	}
	
	private void convertHexadecimal(String stringToConvert) {
		
		if (!testStringAsNumber(stringToConvert, hexNumberRegExp)) {
			System.out.println(String.format(errorMessageFormat, stringToConvert, "hexadecimal number"));
			return;
		} 
		int intValue = Integer.parseInt(stringToConvert.substring(hexPrefix.length()), 16);
		System.out.println(String.format(successMessageFormat, stringToConvert, intValue));
	}
}