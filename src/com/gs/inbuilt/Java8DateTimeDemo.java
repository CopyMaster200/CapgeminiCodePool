package com.gs.inbuilt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Java8DateTimeDemo {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate); // a date in ISO format (yyyy-MM-dd) without time

		// If we want to represent the LocalDate for February 20, 2015:
		localDate = LocalDate.of(2015, 02, 20);
		System.out.println(localDate);

		// If we want to represent the LocalDate for "2015-02-20" from string:
		localDate = LocalDate.parse("2015-02-20");
		System.out.println(localDate);

		// to get the current local date and adds one day
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("Tomorrow: " + tomorrow);

		// current date and subtracts one month
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println("previousMonthSameDay: " + previousMonthSameDay);

		// To find day of week from date
		DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
		System.out.println("Week Day: " + sunday);

		// To find day of month
		int dayOfmonth = LocalDate.parse("2016-06-12").getDayOfMonth();
		System.out.println("dayOfmonth : " + dayOfmonth);

		// To find leap year or not
		boolean leapYear = LocalDate.now().isLeapYear();
		System.out.println("To find leap year: " + leapYear);

		// Relationship of a date to another can be determined to occur before or after
		// another date
		boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
		boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
		System.out.println("Not before: " + notBefore);

		/*
		 * the LocalDateTime that represents the beginning of the day (2016-06-12T00:00)
		 * of the given date and the LocalDate that represents the beginning of the
		 * month (2016-06-01) respectively:
		 */
		LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
		LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());

		System.out.println("beginningOfDay: " + beginningOfDay);
		System.out.println("beginningOfMonth: " + firstDayOfMonth);

		/*
		 * LocalTime: An instance of current LocalTime can be created from the system
		 * clock:
		 */
		LocalTime now = LocalTime.now();
		System.out.println("Current Time: " + now);

		// We can create a LocalTime representing 6:30 a.m. by parsing a string
		// representation:
		LocalTime sixThirty = LocalTime.parse("06:30");
		System.out.println("Set the time: " + sixThirty);

		// Factory Method
		LocalTime sixThirtyFactory = LocalTime.of(6, 30);

		// adding time
		LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
		System.out.println("Adding time: " + sevenThirty);

		// getter methods are available that can be used to get specific units of time
		// like hour, min and secs:
		int six = LocalTime.parse("06:30").getHour();
		System.out.println("Get hours: " + six);

		// Constants in LocalTime
		LocalTime maxTime = LocalTime.MAX;
		System.out.println(maxTime);

		// We can get the Period between two dates in a specific unit such as days or
		// months or years, using ChronoUnit.between:
		LocalDate initialDate = LocalDate.parse("2007-05-10");
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		long five = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println("Number of days count in between period:" + five);
		
		ageCalculator("1993-12-13");
	}

	private static void ageCalculator(String dob) {
		LocalDate initialDate = LocalDate.parse(dob);
		LocalDate finalDate = LocalDate.now();
		long five = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println("Your Age:" + five/365 + " Years " + five%365 + " days");
	}
}
