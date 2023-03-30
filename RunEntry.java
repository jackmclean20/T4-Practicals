package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class RunEntry extends Entry{

	private Calendar dateAndTime;
	
	public RunEntry(String n, int d, int m, int y, int h, int min, int s, float dist) {
		super(n, d, m, y, h, min, s, dist);
		Calendar inst = Calendar.getInstance();
	    inst.set(y,m-1,d,h,min,s);
	    dateAndTime = inst;
	    distance = dist;
	    allSports.add(this);
	    
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
	
	

	
}
