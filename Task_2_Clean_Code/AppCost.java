package come.homeTask.Clean_Code.Task2_Cost_Estimation;
import java.util.*;

class CostEstimation
{
	public static double houseConstructionCost(int materialStandard, double areaOfHouse, boolean fullyAutomated)
	{
		double cost;
		if(materialStandard == 0)
			cost = 1200 * areaOfHouse;
		else if(materialStandard == 1)
			cost = 1500 * areaOfHouse;
		else
		{
			if(fullyAutomated)
				cost = 2500 * areaOfHouse;
			else
				cost = 1800 * areaOfHouse;
		}
		return cost;
	}
}

public class AppCost {
	 public static void main( String[] args )
	    {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	 System.out.println("Estimation of House Construction Cost");
	         System.out.println("Choose House Material");
	         System.out.println("0 - Standard Material");
	         System.out.println("1 - Above Standard Material");
	         System.out.println("2 - High Standard Material");
	         int materialStandard = sc.nextInt();
	         
	         System.out.println("Area of House");
	         double areaOfHouse = sc.nextDouble();
	         
	         boolean fullyAutomated = false;
	         if(materialStandard == 2)
	         {
	         	System.out.println("Do you want Fully Automated Home: If Yes then Press Y else N");
	             fullyAutomated = (sc.next().equals("Y"));
	         }
	         
	         double cost = CostEstimation.houseConstructionCost(materialStandard, areaOfHouse, fullyAutomated);
	         System.out.println("Estimated House Construction Cost: " + cost);
	         
	         sc.close();
	    }
}
