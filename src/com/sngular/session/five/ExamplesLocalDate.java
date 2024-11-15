package com.sngular.session.five;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ExamplesLocalDate {

	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.now();
//		new Date(2020, 02, 20);
//		new Date();
//		new Date("2020-02-20");
		LocalDate localDate2 = LocalDate.of(2020, 02, 20);
		LocalDate localDate3 = LocalDate.parse("2020-02-20");
		LocalDate localDate4 = LocalDate.of(1988, Month.APRIL, 3);

		DayOfWeek dow = localDate1.getDayOfWeek();
		int dom = localDate1.getDayOfMonth();
		int year = localDate1.getYear();
		int month = localDate1.getMonthValue();
		Month month2 = localDate1.getMonth();
		
		System.out.println(localDate1);
		System.out.println(localDate2);
		System.out.println(localDate3);
		System.out.println(localDate4);
		System.out.println(dow);
		System.out.println(dom);
		System.out.println(year);
		System.out.println(month);
		System.out.println(month2);
		System.out.println("***********");
		
		System.out.println(ChronoUnit.DAYS.between(localDate2, localDate1));
		System.out.println(localDate1.plusDays(8).toString());
		System.out.println(localDate1.plusDays(-20).toString());
	}
}
