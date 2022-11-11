package inner_classes;
/*
 * Rule1: To access the inner class, create an object of the outer class, and then create an object of the inner class
 */
class OuterClass1 {
	int x=10;
	class InnerClass1{
		int y=5;
	}
	public static void main(String[] args) {
		OuterClass1 oc1 = new OuterClass1();
		OuterClass1.InnerClass1 oc1ic1= oc1.new InnerClass1();
		System.out.println("oc1.x+oc1ic1.y:"+ (oc1.x+oc1ic1.y));
	}

}
