// This class holds information about a single training session
package com.stir.cscu9t4practical1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class Entry {
	private String name;
	private Calendar dateAndTime;
	public float distance;
	protected static ArrayList<Entry> allSports = new ArrayList<>();

	public Entry(String n, int d, int m, int y, int h, int min, int s, float dist) {
		name = n;
		distance = dist;
		Calendar inst = Calendar.getInstance();
		inst.set(y, m - 1, d, h, min, s);
		dateAndTime = inst;
		distance = dist;
	} // constructor

	public String getName() {
		return name;
	} // getName

	public int getDay() {
		return dateAndTime.get(Calendar.DATE);
	} // getDay

	public int getMonth() {
		int month = dateAndTime.get(Calendar.MONTH) + 1;
		return month;
	} // getMonth

	public int getYear() {
		int year = dateAndTime.get(Calendar.YEAR);
		return year;
	}

	public int getHour() {
		int hour = dateAndTime.get(Calendar.HOUR);
		return hour;
	}

	public int getMin() {
		int minute = dateAndTime.get(Calendar.MINUTE);
		return minute;
	}

	public int getSec() {
		int sec = dateAndTime.get(Calendar.SECOND);
		return sec;
	}

	public float getDistance() {
		return distance;
	}

	public static ArrayList<Entry> getAllSports() {
		return allSports;
	}
	
	public String getEntry(String sport) {
		System.out.println(sport);
		for (Entry entry : allSports) {
			if (entry instanceof SprintEntry && sport.equals("Sprints")) {
				String result = entry.getName()+" sprinted " + SprintEntry.getRepetitions() + "x" + entry.getDistance() + "m in "
			             +entry.getHour()+":"+entry.getMin()+":"+ entry.getSec() + " with " + SprintEntry.getRecovery() + " minutes recovery on "
			             +entry.getDay()+"/"+entry.getMonth()+"/"+entry.getYear()+"\n";
			   return result;
			}
			else if (entry instanceof SwimEntry && sport.equals("Swimming")) {
				String result = getName() + " swam " + getDistance() + " km " + SwimEntry.getWhere() + " in " + getHour() + ":"
						+ getMin() + ":" + getSec() + " on " + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
				return result;
			}
			else if (entry instanceof CycleEntry && sport.equals("Cycle")) {
				 String result = getName()+" cycled " + getDistance() + " km in "
			             +getHour()+":"+getMin()+":"+ getSec() + " on "
			             +getDay()+"/"+getMonth()+"/"+getYear()+ " on " + CycleEntry.getTerrain() + " at " + CycleEntry.getTempo() + " tempo " + "\n";
			   return result;
			}
			else if (entry instanceof RunEntry && sport.equals("Run")){
				 String result = getName()+" ran " + getDistance() + " km in "
			             +getHour()+":"+getMin()+":"+ getSec() + " on "
			             +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
			   return result;
			}
		}
		return "No records found";
		
	}
	

} // Entry