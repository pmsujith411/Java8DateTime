package main.java;

import java.time.Duration;
import java.time.Period;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Display maturity dates");
		System.out.println(BankDepositExercise.getMaturityDate("2012-12-12", Period.ofYears(5)));
		System.out.println();
		
		System.out.println("Display investment periods");
		System.out.println(BankDepositExercise.getInvestmentPeriod("2012-12-12", "2020-08-08"));
		System.out.println();
		
		System.out.println("Display expiring tablets");
		System.out.println(DateTimeExercise.getExpiringTablets(5));
		System.out.println();
		
		System.out.println("Display expiring tablets sorted");
		System.out.println(DateTimeExercise.getExpiringTabletsSorted());
		System.out.println();
		
		System.out.println("Display expiring tablets period");
		System.out.println(DateTimeExercise.getTabletExpiryPeriod());
		System.out.println();
		
		System.out.println("Display same year expiring tablets details");
		System.out.println(DateTimeExercise.getSameYearExpiry());
		System.out.println();
		
		System.out.println("Display working days in the next month");
		System.out.println(WorkingDaysExercise.getNextMonthsWorkingDays());
		System.out.println();
		
		System.out.println("Display bus timings for a day");
		System.out.println(Utility.getBusSchedule("12-07-2020 08:30", Duration.ofHours(2)));
		System.out.println();
	}
}
