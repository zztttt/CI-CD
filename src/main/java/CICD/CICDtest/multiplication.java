package CICD.CICDtest;

public class multiplication {
	
	public static void main( String[] args )
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.print(multiply(a, b));
    }
	
	public static int multiply(int a, int b)
	{
		return a*b;
	}
}
