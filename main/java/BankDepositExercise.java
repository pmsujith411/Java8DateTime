package main.java;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class BankDepositExercise 
{
	public static String getMaturityDate(String investmentDate, Period duration)
	{
		LocalDate localDate = LocalDate.parse(investmentDate);
		
		return localDate.plus(duration).format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
	}
	
	public static String getInvestmentPeriod(String investmentDate, String maturityDate)
	{
		LocalDate investDate = LocalDate.parse(investmentDate);
		LocalDate matureDate = LocalDate.parse(maturityDate);
		Period period = Period.between(investDate,matureDate);
		return (period.getYears()+" Years "+period.getMonths()+" Months "+period.getDays()+" Days");
	}
}
