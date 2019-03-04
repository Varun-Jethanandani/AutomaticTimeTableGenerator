

import java.text.SimpleDateFormat;

public class TimePassDate {
	public static void main(String[] args) throws Exception 
	{
    	SimpleDateFormat dateformat = new SimpleDateFormat("h:mm");
    	System.out.println(dateformat.parse("8:10"));
	}
}
