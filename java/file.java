import java.io.File;
class main
{
	public static void main(String args[])
	{
		File file = new File("newfile.text");
		try{
		boolean value = file.createNewFile();
			if(value)
		{
			System.out.println("The file is created");
		}
		else
		{
			System.out.println("The file is not created");
		}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
	}
}
