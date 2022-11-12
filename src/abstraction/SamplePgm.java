package abstraction;

public class SamplePgm {

	int num1;  // set num1=10 , get print the value of num1
	int num2;
	int num3;
	
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum1() {
		return this.num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum2() {
		return this.num2;
	}
	
	public int add()
	{
		return this.num1 + this.num2;
	}
	
	public static void main(String[] args) {
		SamplePgm sp = new SamplePgm();
		sp.setNum1(10);
		sp.setNum2(12);
		System.out.println(sp.getNum1());
		System.out.println(sp.add());

	}

}
