public class Integer2  {

	private int value;
	
	private final String prettyPrintFormat = "%d";
	
	public static void  main(String[] args) {
			
			
			
	}
	
	public int getValue() {
		
		return value;
	}
	
	public void setValue (int value) {
		
		this.value = value;
	}
	
	public boolean isEven() {
		
		return value % 2 == 0;
	}
	
	public boolean isOdd() {
		
		return !isEven();
	}
	
	public void prettyPrint() {
		
		System.out.print(getStringValue());
	}
	
	public String toString() {
		return getStringValue();
	}
	//
	//	Private methods from here
	//
	private String getStringValue() {
		
		return String.format(prettyPrintFormat, value);
	}
	
}