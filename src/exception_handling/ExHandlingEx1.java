package exception_handling;

public class ExHandlingEx1 {

	public static void main(String[] args) {
		try
		{
			int a=5/0;
			System.out.println("Dividing 5 by 0");
		}
		catch(ArithmeticException e)
		{
			System.out.println("1.The following exception occurred:"+e.getMessage());
			System.out.println("2.The following exception occurred:"+e.getLocalizedMessage());
			System.out.println("3.The following exception occurred:"+e.hashCode());
			System.out.println("4.The following exception occurred:"+e.toString());
			System.out.println("5.The following exception occurred:"+e.fillInStackTrace());
			System.out.println("6.The following exception occurred:"+e.getCause());
			System.out.println("7.The following exception occurred:"+e.getClass());
			System.out.println("8.The following exception occurred:"+e.getStackTrace());
			System.out.println("9.The following exception occurred:"+e.getSuppressed());
			System.out.println("10.The following exception occurred:"+e.initCause(e));


		}
	}

}
