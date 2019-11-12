package typeCasting;

public class PeriodConverterExample {

	public static void main(String[] args) {
		final int YEAR_DAYS = 365;
	    final int MONTH_DAYS = 30;
	    final int WEEK_DAYS = 7;
	    
	    int periodDays = 1234;
	    
	    int toYears;
	    int toMonths;
	    int toWeeks;
	    	    	 
	    toYears = periodDays / YEAR_DAYS;
	    int toYearsRest = periodDays % YEAR_DAYS;
	    toMonths = toYearsRest / MONTH_DAYS;
	    int toMonthsRest = toYearsRest % MONTH_DAYS;
	    toWeeks = toMonthsRest / WEEK_DAYS;
	    int toWeeksRest = toMonthsRest % WEEK_DAYS;
	   	System.out.println(periodDays + " days = " + toYears + " years, " + toMonths + 
		" months, " + toWeeks + " weeks, and " + toWeeksRest + " days" );

	}

}
