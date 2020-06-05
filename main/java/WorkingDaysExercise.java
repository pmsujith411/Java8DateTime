package main.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class WorkingDaysExercise 
{
	public static List<String> getNextMonthsWorkingDays()
	{
		List<String> workingDays = new ArrayList<>();
		
		LocalDate nextMonth = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
		
		Month month = nextMonth.getMonth();
		
		while(nextMonth.getMonth() == month)
		{
			if((nextMonth.getDayOfWeek() != DayOfWeek.SUNDAY) && (nextMonth.getDayOfWeek() != DayOfWeek.SATURDAY))
			{
				workingDays.add(nextMonth.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString());
			}
			
			nextMonth = nextMonth.plusDays(1);
		}
		
		return workingDays;
	}
}
