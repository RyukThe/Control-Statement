package control;

public class example12_if_else
{
public static void main(String[] args) 
{
	
	int marks=32;
	
	//32>=65
	if(marks>=65)
	{
		System.out.println("distinction");
	}
	//       32>=60    &  62<=64
	else if (marks>=60  & marks<=64)             //60 - 64 
	{
		System.out.println("1st class");
	}
	//       32>=50   & 55<=59
	else if(marks>=50 & marks<=59)                              //50 - 59
	{
		System.out.println("2nd class");
	}
	//      32>=35   & 40<= 49
	else if (marks>=35 & marks<=49)         //35 - 49
	{
		System.out.println("Pass");
	}
	//         32<=35
	else if (marks<35)
	{
		System.out.println("Fail");
	}
			
}

}

