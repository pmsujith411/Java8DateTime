package main.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DateTimeExercise 
{
	static private List<Tablet> tablist = new ArrayList<>();

	static 
	{
		tablist.add(new Tablet("Abc", "DX", LocalDate.parse("2007-04-10"), LocalDate.parse("2027-05-10")));
		tablist.add(new Tablet("Pqr", "LMO", LocalDate.parse("2012-02-10"), LocalDate.parse("2020-10-10")));
		tablist.add(new Tablet("xzy", "KJK", LocalDate.parse("2017-12-10"), LocalDate.parse("2019-05-10")));
		tablist.add(new Tablet("vbn", "LMO", LocalDate.parse("2020-01-10"), LocalDate.parse("2020-05-10")));
		tablist.add(new Tablet("fgh", "LMO", LocalDate.parse("2020-02-10"), LocalDate.parse("2020-05-10")));
		tablist.add(new Tablet("jkl", "LMO", LocalDate.parse("2020-03-19"), LocalDate.parse("2020-05-10")));
	}

	public static List<String> getExpiringTablets(int months) 
	{
		return tablist.stream().filter(tab -> tab.expiryDate.isBefore(LocalDate.now().plusMonths(months)))
				.map(Tablet::getName).collect(Collectors.toList());
	}

	public static List<Tablet> getExpiringTabletsSorted() 
	{
		return tablist.stream().sorted(Comparator.comparing(Tablet::getExpiryDate)).collect(Collectors.toList());
	}

	public static Map<String, String> getTabletExpiryPeriod() 
	{
		Function<Tablet, String> function = tablet -> {
			Period period = Period.between(tablet.manufactureDate, tablet.expiryDate);
			return (period.getYears() + " year/s " + period.getMonths() + " month/s " + period.getDays() + " day/s");
		};
		
		return tablist.stream().collect(Collectors.toMap(Tablet::getName, function));
	}
	
	public static Map<String, List<String>>getSameYearExpiry()
	{
		return tablist.stream().filter(tablet->tablet.expiryDate.getYear()==LocalDate.now().getYear()&&
				tablet.expiryDate.isBefore(LocalDate.now())).collect(Collectors.groupingBy(Tablet::getManufacturer, Collectors.mapping(Tablet::getName, Collectors.toList())));
	}
}
