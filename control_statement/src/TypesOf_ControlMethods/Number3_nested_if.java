package TypesOf_ControlMethods;

public class Number3_nested_if 
{
		public static void main(String[] args)
		{
			
			int PEM= 500;
			
			//500>=300
			if(PEM>=300)   //outer if
			{
				System.out.println("Eligible for mains exam");
				int MEM=650;
				//650>=600
				if(MEM>=600)        //inner / nested if
				{
					System.out.println("Got selected");
				}
				else
				{
					System.out.println("Rejected: MEM<600");
				}
			}
			else
			{
				System.out.println("Not Eligible for mains exam");
			}
		}
	}

