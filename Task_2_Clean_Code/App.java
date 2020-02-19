package come.homeTask.Clean_Code.Task2_Cost_Estimation;
import java.util.*;

class InterestCalculate
{
	public static double calculateSI(double principal, double rate, int time)
	{
		return ((principal * rate * time)/100);
	}
	
	public static double calculateCI(double principal, double rate, int time)
	{
		double amount = principal * Math.pow(1 + rate/100,time);
		return (amount - principal);
	}
	
}

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("Enter Principal");
        double principal = sc.nextDouble();
        
        System.out.println("Enter Rate");
        double rate = sc.nextDouble();
        
        System.out.println("Enter Time");
        int time = sc.nextInt();
        
        double SI = InterestCalculate.calculateSI(principal, rate, time);
        double CI = InterestCalculate.calculateCI(principal, rate, time);
        
        System.out.println("Simple Interest: " + SI);
        System.out.println("Compound Interest: " + CI);
        
        sc.close();
       
    }
}
