import ExceptionExample.HandlingException;
import InheritanceExample.ISuper;
import InheritanceExample.InterfaceImplementation;
import InheritanceExample.Sub;
import InheritanceExample.Super;

public class Main {

	public static void main(String[] args) {

		
		/* Inheritance Examples */
		  Sub sub = new Sub();  // sub object with sub constructor
		  sub.callSub(); 
		  System.out.println(sub.getAge());
		  
		  Super supers = new Sub(); // super object with sub cons
		  System.out.println("*****" + supers.calculateApproxAge());
		 

		/* Exception Examples */
		HandlingException handlingException = new HandlingException();
		try {
			handlingException.divide();
		} catch (NullPointerException ex) {
			System.out.println("Catching nullpointer ex " + ex.getMessage());
		} catch (ArithmeticException ex) {
			System.out.println("Catching arthmetic ex " + ex.getMessage());
		}

		try {
			handlingException.getFourthElement();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Catching arrayindexoutofbound ex " + ex.getMessage());
		}

		try {
			handlingException.getLengthOfZeroElementArray();
		} catch (NullPointerException ex) {
			System.out.println("Catching NullPointerException ex " + ex.getMessage());
		}

		/* Interfaces Examples */
		InterfaceImplementation iImp = new InterfaceImplementation(); // imple object; iImp.interfaceMethod();

		ISuper.staticInterfaceMethod(); // calling interfaces static method with interface obj
		iImp.staticInterfaceMethod(); // calling sub impl overridden static method with impl object

		String arrayString[] = { "Kartik", "Ojha" };
		System.out.println(arrayString[0]);
	}
	
}
