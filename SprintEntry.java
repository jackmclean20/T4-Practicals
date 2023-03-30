package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class SprintEntry extends Entry {
	private Calendar dateAndTime;
	protected static int repetitions;
	protected static int recovery;
	
	 public SprintEntry (String n, int d, int m, int y, int h, int min, int s, float dist, int reps, int rec) {
		    super(n,d,m,y,h,min,s,dist);
		    Calendar inst = Calendar.getInstance();
		    inst.set(y,m-1,d,h,min,s);
		    dateAndTime = inst;
			allSports.add(this);
			repetitions = reps;
			recovery = rec;
			
	 }

	 public int getYear () {
		    return dateAndTime.get(Calendar.YEAR);
		  } //getYear

		  public int getHour () {
		    return dateAndTime.get(Calendar.HOUR);
		  } //getHour

		  public int getMin () {
		    return dateAndTime.get(Calendar.MINUTE);
		  } //getMin

		  public int getSec () {
		    return dateAndTime.get(Calendar.SECOND);
		  } //getSec

		  public float getDistance () {
		    return distance;
		  } //getYear
		  
		  public static int getRepetitions() {
			  return repetitions;
		  }
		  
		  public static int getRecovery() {
			  return recovery;
		  }
}
