package control;

public class example15_nested_if 
{
public static void main(String[]args)
{
	int PEM=700;         /////Pre Exam Marks=600;
	
	if(PEM>=500)        //////600>=500
	{
		System.out.println("PEM RESULT:-congrats..you are eligible");
		int MEM=500;     /////Mains Exam Marks=500;
	    /////500>=700
		if(MEM>=700)     //outer if
			
		{
			System.out.println("MEM RESULT:-CONGRATS..YOU GOT SELECTED"); 
		}
		else
		{
			System.out.println("MEM RESULT:-Rejected...Because MEM<700");
		}
	}
	else
	{
		System.out.println("Not eligible in this exam");
	}

}
}
