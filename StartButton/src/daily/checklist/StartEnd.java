package daily.checklist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StartEnd 
{

	public static void main(String[] args) 
	{
		SimpleDateFormat dateTimeToday = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		Date dateToday = new Date();
		FileWriter newFile = null;
		BufferedWriter newTextBuffer = null;
		PrintWriter newTextPrinter = null;
		String strDateTimeNow = dateTimeToday.format(dateToday.getTime());
		String strLastDayEntry=null;
		try
		{
			newFile = new FileWriter("C:\\PROJECTS\\DATA\\ITIL\\WORK_BEGIN_TIME.CSV",true);
			newTextBuffer = new BufferedWriter(newFile);
			newTextPrinter = new PrintWriter(newTextBuffer);
			newTextPrinter.println(strDateTimeNow);
			newTextPrinter.close();
			strLastDayEntry = FindLastRow();
		}
		catch (IOException allExceptions)
		{
			allExceptions.printStackTrace();
		}

	}
	public static String FindLastRow()
	{
		String strNow=null;
		try
		{
			File rstLog = new File("C:\\PROJECTS\\DATA\\FILES_INDICATING_END_OF_PROCESS\\DAY_BASE.TXT");
			Scanner scLog = new Scanner(rstLog);
			while (scLog.hasNext())
			{
				strNow=scLog.next();
			}
		}
		catch (IOException allExceptions)
		{
			allExceptions.printStackTrace();
		}

		return strNow;
		
	}

}
