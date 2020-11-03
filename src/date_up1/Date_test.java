package date_up1;

public class Date_test {

public static void main(String[] args)
{
	Date date1 =new Date (45, 12, 1, 5, 1, 2003);
	Date date2 =new Date (15, 22, 2, 4, 2, 2003);
	
	System.out.println(date1.compareTo(date2));
	System.out.println(date1.leap_year(2003));
	System.out.println(date1.add_second(date2));
	
}
}
