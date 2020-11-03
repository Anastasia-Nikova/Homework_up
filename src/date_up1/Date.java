package date_up1;

public class Date
{

	private int second;
	private int minute;
	private int hour;
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		
	}
	
	public Date(int second, int minute, int hour, int day, int month,int year)
	{
		setSecond( second );
		setMinute( minute );
		setHour( hour );
		setDay( day );
		setMonth( month );
		setYear( year );
	}////compareTo
	
	public Date( int year )
	{
		setYear( year );
	} //leap_year
	
	public Date( int day, int month,int year)
	{
		setDay( day );
		setMonth( month );
		setYear( year );
	}//number_count
	
	public int getSecond()  { return second; }
	public int getMinute()	{ return minute; }
	public int getHour()	{ return hour; }
	public int getDay()		{ return day; }
	public int getMonth()	{ return month; }
	public int getYear()	{ return year; }
	
	
	public void setSecond(int second)
	{
		if(( second >= 0 ) && ( second<60 ))
		{
			this.second = second;
		}
	}
	
	public void setMinute(int minute)
	{
		if(( minute >= 0 ) && ( minute<60 ))
		{
			this.minute = minute;
		}
		
	}
	
	public void setHour(int hour)
	{
		if (( hour >= 0 ) && ( hour < 25 ))
		{
			this.hour = hour;
		}
	}
	
	public void setDay(int day)
	{
		if (( month == 1 ) || ( month == 3 ) || ( month == 5 ) || ( month == 7 ) || ( month == 8 ) || ( month == 10 ) || ( month == 12 )) 
		{
			if  (( day > 0 ) && ( day < 32 ))
			{
				this.day = day;
			}
		}
		else if (month == 2)
		{
			if ( leap_year(year) )
			{
				if ( day > 0 && day<30 )
				{
					this.day = day;
				}
			}else if ( day > 0 && day<29 )
			{
				this.day = day;
			}
		}
		else
		{
			if ( day > 0 && day < 31)
			{
				this.day = day;
			}
		}
		
	}
	
	public void setMonth(int month)
	{
		if (( month > 0 ) && (month < 13 ))
		{
			this.month = month;
		}
	}

	public void setYear(int year)
	{
		if ( year >= 0)
		{
			this.year = year;
		}
	}
	
	
	
	
	public int compareTo( Date d )
	{
		if ( this.year > d.year )
		{
			return 1;
		}
		
		if ( this.year < d.year )
		{
			return -1;
		}
		
		if ( this.month > d.month )
		{
			return 1;
		}
		
		if ( this.month < d.month )
		{
			return -1;
		}
			
		if ( this.day > d.day )
		{
			return 1; 	
		}
		
		if ( this.day < d.day )
		{
			return -1; 	
		}
		
		if ( this.hour > hour)
		{
			return 1;
		}
		if ( this.hour < hour)
		{
			return -1;
		}
		if ( this.minute > minute)
		{
			return 1;
		}
		if ( this.minute < minute)
		{
			return -1;
		}
		if ( this.second > second)
		{
			return 1;
		}
		if ( this.second < second)
		{
			return -1;
		}
		return 0;
	}
	
	public boolean leap_year( int year )
	{
	    boolean leap = false;

        if(year % 4 == 0)
        {
        	if( year % 100 == 0)
            {
              if ( year % 400 == 0)
              {
            	  leap = true;
              }
                else leap = false;
            }
            else leap = true;
        }
        else leap = false;
        return leap;
      }
	
	
	public int number_count ()
	{
		int day_count = 0;
		if(month == 1)
		{
			return(day);	
		}
		
		for(int i = 1; i < month; i++) 
		{
			if( i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12 )
			{
				day_count += 31;
			}
			else 
			{
				day_count += 30;
			}
		}
		day_count += day;
		
		return(day_count);

	}
	
	public String add_second( Date d )
	{
		second = second +1;
		if (second == 60)
		{
			second = 0;
			minute++ ;
			if (minute == 60)
			{
				minute = 0;
				hour++;
				if (hour == 25)
				{
					day++;
					if ( ( day == 32) && ( (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12) ))
					{
						month++;
						if (month == 13)
						{
							year ++;
						}
					}
					
					if 	(( day == 29) && (month == 2))
					{
						if (leap_year(year))
						{
							day = 29;
						}
						else month ++;
						if (month == 13)
						{
							year ++;
						}
					}
				}
			}
		}
		String result  = "Second = " + second + "Minute = " + minute + "hour = " + hour + "Day = " + day + " Month = " + month + "Year = " + year;
		return result;
	}


}