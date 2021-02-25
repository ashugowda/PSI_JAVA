import java.util.*;

public class dowhile
{
	public static void main(String args[])
	{   int i =1;
		do
		{
			if(i%2==0){
			break;}
			else
			{
			double result = Math.pow(i,2);
			System.out.println(result);
			}
			
		i++;
		}
		while(i<=10);
		
	}
}

			