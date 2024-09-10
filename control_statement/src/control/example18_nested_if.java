package control;

public class example18_nested_if 
{
public static void main(String[] args) 
{
	System.out.println("MPSC RESULT 2022-23");
	System.out.println("LIST OF STUDENTS:-");
	System.out.println("1.Rushikesh Pramod Munde");
	int PreExamMarks=550;

	if(PreExamMarks>=500)                                       ////outer if
	{
	System.out.println("*Results Of Pre Exam Marks:-");
	System.out.println("congrats....You are eligible for Mains Exam.");
	int MainExamMarks=550;                                                   //inner / nested if
	if(MainExamMarks>=500)                                       
	{
		System.out.println("*Results Of Main Exam Marks:-");                                     //////info used printing statement
		System.out.println("Congrats Rushikesh...You are Passed in MPSC Exam.");
	}
	else
	{
		System.out.println("*Results Of Main Exam Marks:-");
		System.out.println("Sorry Rushikesh...you are failed in Main Exam.");                 //////info used printing statement
	}
	}
	else
	{
		System.out.println("*Results Of Pre Exam Marks:-"); 
		System.out.println("Dear Rushikesh....you are not eligible for Mains Exam.");       //////info used printing statement
	}
}
}
