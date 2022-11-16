package studio8;

import java.util.Objects;

public class Time {
	
	/**
	 * @param hour - takes in hour in the 24 hour format
	 */
	private int hour;
	
	/**
	 * @param minute - takes in amount of minutes, from 0 to 59
	 */
	private int minute;
	
	/*
	 * @param format - if someone wants the time in the 12 hour format or not
	 */
	private boolean format;
	
	
	public Time(int initHour, int initMinute, boolean initFormat) {
		
		hour = initHour;
		minute = initMinute;
		format = initFormat;
		
	}
	
	public String toString() {
		return this.hour + ":" +  this.minute;
	}
	
	public static void main(String[] args) {
 
		Time noon = new Time(12, 0, false);
		Time evening = new Time(20, 0, false);
		System.out.println(noon.equals(evening));
		System.out.println(evening.equals(evening));
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}