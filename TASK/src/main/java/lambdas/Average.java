package lambdas;

import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Average {
	public static void  main(String[] args) {
		int lowerBound=0,UpperBound=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower bound of values in list:");
		lowerBound=sc.nextInt();
		System.out.println("Enter the upper bound of values in list:");
		UpperBound=sc.nextInt();
        IntStream StreamObj=IntStream.range(lowerBound,UpperBound);
        OptionalDouble optionalDouble=StreamObj.average();
        if(optionalDouble.isPresent())
        {
            System.out.println("Average is: "+optionalDouble.getAsDouble());
        }
        else
        {
            System.out.println("Try again!");
        }
	    	
	}
}
