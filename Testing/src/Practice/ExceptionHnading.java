package Practice;

public class ExceptionHnading {

	public static void main(String[] args){
		try{
	    int x=5;
		int y=x/0;
		System.out.println(y);
		}
		catch(Exception e) {
			System.out.println("please eneter valid number");
			System.out.println(e);
		}
	}

}
