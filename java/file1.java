import java.io.File;

class main
{
	public static void main(String args[])
	{
		File file = new File("newFile1.text");
		//creating file
		try
		{
			boolean value = file.createNewFile();
			if(value)
			{
				System.out.println("New file is created");
			}
			else
			{
				System.out.println("New file is not created");
			}
		}
		catch(Exception e)
		{e.getStackTrace();
		}
	}
}
	