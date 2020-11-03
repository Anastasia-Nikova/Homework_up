package date_up1;

public class Event 
{
	private Date date;
	private String name;
	
	public Event ()
	{
		
	}
	
	public Event (Date date, String name)
	{
		this.date = date;
		this.name = name;
	}
	
	
	
	public Date getDate()
	{
		return this.date;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String toString()
	{
		String result = "";
		result = "Name - " + name + "Date" + date;
		return result;
	}
}
