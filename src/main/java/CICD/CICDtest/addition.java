package CICD.CICDtest;

public class addition 
{
	public static void main( String[] args )
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = 0;
        System.out.print(add(a, b));
    }
	
	public static int add(int a, int b)
	{
		return a+b;
	}
}
