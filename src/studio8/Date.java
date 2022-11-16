package studio8;

import java.util.Objects;

public class Date {

	/**
	 * @param month - what month it is
	 */
	private int month;
	
	/**
	 * @param day - what day it is, from 1 to 31
	 */
	private int day;
	
	/**
	 * @param year - what year it is
	 */
	private int year;
	
	/**
	 * @param holiday - if that day is a holiday
	 */
	private boolean holiday;

	public Date(int initMonth, int initDay, int initYear, boolean initHoliday) {
		
		month = initMonth;
		day = initDay;
		year = initYear;
		holiday = initHoliday;
		
	}
	
	public String toString(){
		return this.month + " " + this.day + "," + this.year;
		
	}
	
	
	
    @Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}

	public static void main(String[] args) {

		Date start = new Date(1, 1, 2000, false);
		Date end = new Date(12, 31, 2000, false);
		System.out.println(start.equals(end));
		System.out.println(start.equals(start));
		
    }

}
