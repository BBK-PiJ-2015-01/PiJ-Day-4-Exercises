public class Exercise4 {
	
		private final String binaryRegExp = "\\A[01]+\\Z";
//		private final String binaryRegExp = "\\^[01]+\\$";
//
		private final String readBinaryPrompt = "Enter a binary number> ";
		
		
		public static void main(String[] args) {
			
			new Exercise4().exercise4Runner();
		}

		private void exercise4Runner() {
			
			System.out.print("Enter a binary number> ");
			String stringToTest = System.console().readLine();
			String binaryTestResult = stringToTest.matches(binaryRegExp) ? " IS binary" : " is NOT binary";
			System.out.println(stringToTest + binaryTestResult);
			
		}
		
		private String binary2decimal(String binaryString) {
			
			return null;
		}
		
		private String readBinaryNumber() {
			
			System.out.print(readBinaryPrompt);
			
		}
		
		private 
		

}