package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class CycleEntry extends Entry {
	private Calendar dateAndTime;
	protected static String terrain;
	protected static String tempo;
	
	 public CycleEntry (String n, int d, int m, int y, int h, int min, int s, float dist, String ter, String tem) {
		    super(n,d,m,y,h,min,s,dist);
		    Calendar inst = Calendar.getInstance();
		    inst.set(y,m-1,d,h,min,s);
		    dateAndTime = inst;
		    distance = dist;
		    allSports.add(this);
		    terrain = ter;
		    tempo = tem;
		    
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
		  
		  public static String getTerrain() {
			  return terrain;
		  }
		  
		  public static String getTempo() {
			  return tempo;
		  }
}
