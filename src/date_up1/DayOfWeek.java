package date_up1;

public enum DayOfWeek
{
	Monday(1),
	Tuesday(2),
	Wednesday(3),
	Thursday(4),
	Friday(5),
	Saturday(6),
	Sunday(7);

    private int day;
	
	private DayOfWeek(int day)
	{
		this.day = day;
	}
	
	public String  toString()
	{
		if (day == 1)
		{
			return "Monday";
		}
		if (day == 2)
		{
			return "Tuesday";
		}
		if (day == 3)
		{
			return "Wednesday";
		}
		if (day == 4)
		{
			return "Thursday";
		}
		if (day == 5)
		{
			return "Friday";
		}
		if (day == 6)
		{
			return "Saturday";
		}
			return "Sunday";
	}
}