public class ExerciseRunner {

	public static void main(String[] args) {
		
		new ExerciseRunner().runExercise7();
	}
	
	private void runExercise7() {
		
		Integer aarg = new Integer(3.3);
		Integer2 i2 = new Integer2();
		System.out.print("Enter a number: ");
		String str = System.console().readLine();
		int i = Integer.parseInt(str);
		i2.setValue(i);
		System.out.print("The number you entered is ");
		if (i2.isEven()) {
			System.out.println("even.");
		} else if (i2.isOdd()) {
			System.out.println("odd.");
		} else {
			System.out.println( "undefined!! Your code is buggy!");
		}
		int parsedInt = Integer.parseInt(i2.toString());
		if (parsedInt == i2.getValue()) {
			System.out.println("Your toString() method seems to work fine.");
		}
	}
}