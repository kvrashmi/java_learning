package inner_classes;

public class OuterClass2 {
	int x=10;
	private class InnerClass2{
		int y=20;
	}

	public static void main(String[] args) {
		OuterClass2 oc2 = new OuterClass2();
		//Inside the same class this private inner class is accessible
		OuterClass2.InnerClass2 ic2 = oc2.new InnerClass2();
		System.out.println(oc2.x+ic2.y);
	}

}
