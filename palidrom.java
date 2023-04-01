package basictest;

public class palidrom {

	public static void main(String[] args) {
		int a=324;
		int temp=a;
		int add=0;
		while(a>0)
		{
			int num= a%10;
			 add=add*10+num;
			 a=a/10;
		}
		
		if (add==temp)
		{System.out.println("pali");
		
		}
		else
		{
			System.out.println("not pali");
		}
	}
	

}
