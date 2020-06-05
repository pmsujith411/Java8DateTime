package main.java;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Utility 
{
	public static List<String> getBusSchedule(String start, Duration frequency)
	{
		List<String> busTimings = new ArrayList<>();
		
		LocalDateTime localDateTime = LocalDateTime.parse(start, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
		DayOfWeek day = localDateTime.getDayOfWeek();
	
		while(localDateTime.getDayOfWeek() == day)
		{
			busTimings.add(localDateTime.format(DateTimeFormatter.ofPattern("HH:mm")).toString());
			localDateTime = localDateTime.plus(frequency);
		}	
		
		return busTimings;
	}
}
