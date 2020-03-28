package InheritanceExample;

public class Sub extends Super {

	public void callSuper() {
		super.getAge();
	}

	public void callSub() {
		Sub s = new Sub();
		s.callSuper();
	}

	@Override
	public int getAge() {
		super.age = 25;
		return super.getAge();
	}

	@Override
	public int calculateApproxAge() {
		return 126;
	}
	
	public void cu() {
		System.out.println("clllll");
	}
}
