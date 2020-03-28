package ExceptionExample;

public class HandlingException {

	int a = 1;
	int b = 0;
	int arr[] = { 1, 2, 3 };
	String zeroelem = null;

	public void divide() {
		int x = a / b;
		System.out.println(x);
	}

	public int getFourthElement() {
		return arr[3];
	}
	
	public int getLengthOfZeroElementArray() {
		return zeroelem.length();
	}

}
