// GUI and main program for the Training Record
package com.stir.cscu9t4practical1;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

public class TrainingRecordGUI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sport = "";
	private JTextField name = new JTextField(30);
	private JTextField day = new JTextField(2);
	private JTextField month = new JTextField(2);
	private JTextField year = new JTextField(4);
	private JTextField hours = new JTextField(2);
	private JTextField mins = new JTextField(2);
	private JTextField secs = new JTextField(2);
	private JTextField dist = new JTextField(4);
	private JTextField reps = new JTextField(3);
	private JTextField recovery = new JTextField(2);
	private JTextField where = new JTextField(15);
	private JTextField terrain = new JTextField(15);
	private JTextField tempo = new JTextField(15);
	private JLabel labn = new JLabel(" Name:");
	private JLabel labd = new JLabel(" Day:");
	private JLabel labm = new JLabel(" Month:");
	private JLabel laby = new JLabel(" Year:");
	private JLabel labh = new JLabel(" Hours:");
	private JLabel labmm = new JLabel(" Mins:");
	private JLabel labs = new JLabel(" Secs:");
	private JLabel labdist = new JLabel(" Distance (km):");
	private JLabel labdistm = new JLabel(" Distance (m)");
	private JLabel labrep = new JLabel(" Repetitions:");
	private JLabel labrec = new JLabel(" Recovery Time:");
	private JLabel labw = new JLabel(" Where:");
	private JLabel labter = new JLabel(" Terrain:");
	private JLabel labtem = new JLabel(" Tempo:");
	private JButton run = new JButton("Run");
	private JButton swim = new JButton("Swimming");
	private JButton sprint = new JButton("Sprints");
	private JButton cycle = new JButton("Cycle");
	private JButton addR = new JButton("Add");
	private JButton lookUpByDate = new JButton("Look Up");
	private JButton findAllByDate = new JButton("Find All");
	private JButton remove = new JButton("Remove Entry");

	private TrainingRecord myAthletes = new TrainingRecord();

	private JTextArea outputArea = new JTextArea(5, 50);
	
	public static void main(String[] args) {
		TrainingRecordGUI applic = new TrainingRecordGUI();
	} // main

	// set up the GUI
	public TrainingRecordGUI() {
		super("Training Record");
		setLayout(new FlowLayout());
		add(run);
		run.addActionListener(this);
		add(sprint);
		sprint.addActionListener(this);
		add(swim);
		swim.addActionListener(this);
		add(cycle);
		cycle.addActionListener(this);
		setSize(720, 480);
		setVisible(true);

		// To save typing in new entries while testing, uncomment
		// the following lines (or add your own test cases)

	} // constructor

	// listen for and respond to GUI events
	public void actionPerformed(ActionEvent event) {
		String message = "";
		if (event.getSource() == run) {
			sport = "Run";
			
			add(labn);
			add(name);
			name.setEditable(true);
			add(labd);
			add(day);
			day.setEditable(true);
			add(labm);
			add(month);
			month.setEditable(true);
			add(laby);
			add(year);
			year.setEditable(true);
			add(labh);
			add(hours);
			hours.setEditable(true);
			add(labmm);
			add(mins);
			mins.setEditable(true);
			add(labs);
			add(secs);
			secs.setEditable(true);
			add(labdist);
			add(dist);
			dist.setEditable(true);

			add(addR);
			addR.addActionListener(this);
			add(lookUpByDate);
			lookUpByDate.addActionListener(this);
			add(outputArea);
			addR.addActionListener(this);
			add(findAllByDate);
			findAllByDate.addActionListener(this);
			add(remove);
			remove.addActionListener(this);
			add(outputArea);
			outputArea.setEditable(false);
			remove(labw);
			remove(where);
			remove(labter);
			remove(terrain);
			remove(labtem);
			remove(tempo);
			remove(labdistm);
			blankDisplay();
			revalidate();
			repaint();
		}
		if (event.getSource() == sprint) {
			sport = "Sprints";
			
			add(labn);
			add(name);
			name.setEditable(true);
			add(labd);
			add(day);
			day.setEditable(true);
			add(labm);
			add(month);
			month.setEditable(true);
			add(laby);
			add(year);
			year.setEditable(true);
			add(labh);
			add(hours);
			hours.setEditable(true);
			add(labmm);
			add(mins);
			mins.setEditable(true);
			add(labs);
			add(secs);
			secs.setEditable(true);
			add(labdistm);
			add(dist);
			dist.setEditable(true);
			add(labrep);
			add(reps);
			reps.setEditable(true);
			add(labrec);
			add(recovery);
			recovery.setEditable(true);

			add(addR);
			addR.addActionListener(this);
			add(lookUpByDate);
			lookUpByDate.addActionListener(this);
			add(outputArea);
			addR.addActionListener(this);
			add(findAllByDate);
			findAllByDate.addActionListener(this);
			add(remove);
			remove.addActionListener(this);
			add(outputArea);
			outputArea.setEditable(false);
			remove(labw);
			remove(where);
			remove(labter);
			remove(terrain);
			remove(labtem);
			remove(tempo);
			remove(labdist);
			blankDisplay();
			revalidate();
			repaint();
			
		}
		if (event.getSource() == swim) {
			sport = "Swimming";
			
			add(labn);
			add(name);
			name.setEditable(true);
			add(labd);
			add(day);
			day.setEditable(true);
			add(labm);
			add(month);
			month.setEditable(true);
			add(laby);
			add(year);
			year.setEditable(true);
			add(labh);
			add(hours);
			hours.setEditable(true);
			add(labmm);
			add(mins);
			mins.setEditable(true);
			add(labs);
			add(secs);
			secs.setEditable(true);
			add(labdist);
			add(dist);
			dist.setEditable(true);
			add(labw);
			add(where);
			where.setEditable(true);
			add(addR);
			addR.addActionListener(this);
			add(lookUpByDate);
			lookUpByDate.addActionListener(this);
			add(outputArea);
			addR.addActionListener(this);
			add(findAllByDate);
			findAllByDate.addActionListener(this);
			add(remove);
			remove.addActionListener(this);
			add(outputArea);
			outputArea.setEditable(false);
			remove(labrep);
			remove(reps);
			remove(labrec);
			remove(recovery);
			remove(labter);
			remove(terrain);
			remove(labtem);
			remove(tempo);
			remove(labdistm);
			blankDisplay();
			revalidate();
			repaint();
		}
		if (event.getSource() == cycle) {
			sport = "Cycle";
			
			add(labn);
			add(name);
			name.setEditable(true);
			add(labd);
			add(day);
			day.setEditable(true);
			add(labm);
			add(month);
			month.setEditable(true);
			add(laby);
			add(year);
			year.setEditable(true);
			add(labh);
			add(hours);
			hours.setEditable(true);
			add(labmm);
			add(mins);
			mins.setEditable(true);
			add(labs);
			add(secs);
			secs.setEditable(true);
			add(labdist);
			add(dist);
			dist.setEditable(true);
			add(labter);
			add(terrain);
			terrain.setEditable(true);
			add(labtem);
			add(tempo);
			tempo.setEditable(true);
			add(addR);
			addR.addActionListener(this);
			add(lookUpByDate);
			lookUpByDate.addActionListener(this);
			add(outputArea);
			addR.addActionListener(this);
			add(findAllByDate);
			findAllByDate.addActionListener(this);
			add(remove);
			remove.addActionListener(this);
			add(outputArea);
			outputArea.setEditable(false);
			remove(labrep);
			remove(reps);
			remove(labrec);
			remove(recovery);
			remove(labw);
			remove(where);
			remove(labdistm);
			blankDisplay();
			revalidate();
			repaint();
		}
		if (event.getSource() == addR) {
			message = addEntry(sport);
		}
		if (event.getSource() == lookUpByDate) {
			message = lookupEntry(sport);
		}
		if (event.getSource() == findAllByDate) {
			message = findAllByDate(sport);
		}
		if (event.getSource() == remove) {
			removeEntry();
		}

		outputArea.setText(message);
		blankDisplay();
	} // actionPerformed

	public String addEntry(String what) {
		String message = "Record added\n";
		String n = name.getText();
		String w = where.getText();
		String ter = terrain.getText();
		String temp = tempo.getText();
		System.out.println("Adding " + what + " entry to the records");
		int m = Integer.parseInt(month.getText());
		int d = Integer.parseInt(day.getText());
		int y = Integer.parseInt(year.getText());
		float km = java.lang.Float.parseFloat(dist.getText());
		int h = Integer.parseInt(hours.getText());
		int mm = Integer.parseInt(mins.getText());
		int s = Integer.parseInt(secs.getText());
		Entry e = null;
		
		if (what.equals("Run")) {
			e = new RunEntry(n, d, m, y, h, mm, s, km);
		}

		if (what.equals("Swimming")) {
			e = new SwimEntry(n, d, m, y, h, mm, s, km, w);
		}
		if (what.equals("Sprints")) {
			int rep = Integer.parseInt(reps.getText());
			int rec = Integer.parseInt(recovery.getText());
			e = new SprintEntry(n, d, m, y, h, mm, s, km, rep, rec);
			}
		if (what.equals("Cycle")) {
			e = new CycleEntry(n, d, m, y, h, mm, s, km, ter, temp);
		}

		myAthletes.addEntry(e);
		return message;
	}

	public String lookupEntry(String sport) {
		int m = Integer.parseInt(month.getText());
		int d = Integer.parseInt(day.getText());
		int y = Integer.parseInt(year.getText());
		outputArea.setText("looking up record ...");
		String message = myAthletes.lookupEntry(d, m, y, sport);
		return message;
	}

	public String findAllByDate(String sport) {
		int m = Integer.parseInt(month.getText());
		int d = Integer.parseInt(day.getText());
		int y = Integer.parseInt(year.getText());
		outputArea.setText("looking up record... ");
		String message = myAthletes.lookupAllEntries(d, m, y, sport);
		return message;
	}

	public void removeEntry() {
		String n = name.getText();
		int m = Integer.parseInt(month.getText());
		int d = Integer.parseInt(day.getText());
		int y = Integer.parseInt(year.getText());
		outputArea.setText("Removing record");
		myAthletes.removeEntry(n, d, m, y);
	}
	
	public void blankDisplay() {
		name.setText("");
		day.setText("");
		month.setText("");
		year.setText("");
		hours.setText("");
		mins.setText("");
		secs.setText("");
		dist.setText("");
		reps.setText("");
		recovery.setText("");
		terrain.setText("");
		tempo.setText("");
		where.setText("");

	}// blankDisplay
		// Fills the input fields on the display for testing purposes only

	public void fillDisplay(Entry ent) {
		name.setText(ent.getName());
		day.setText(String.valueOf(ent.getDay()));
		month.setText(String.valueOf(ent.getMonth()));
		year.setText(String.valueOf(ent.getYear()));
		hours.setText(String.valueOf(ent.getHour()));
		mins.setText(String.valueOf(ent.getMin()));
		secs.setText(String.valueOf(ent.getSec()));
		dist.setText(String.valueOf(ent.getDistance()));
	}
	

} // TrainingRecordGUI
