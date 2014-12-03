package app;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MemMgrFileWriter<T> implements IWriter<T> 
{
	String fileName = "MemMgrFile.txt";
	@Override
	public void writeData(List<T> list)  
	{
		PrintWriter outputFile;
		try 
		{
			outputFile = new PrintWriter(fileName);
			
			while(!list.isEmpty())
			{
				outputFile.println(list.remove(0));
			}
			outputFile.close();
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
	}
}