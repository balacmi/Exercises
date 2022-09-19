package day4.exercises.exercise5;

import java.util.ArrayList;

import day3.exercises.exercise4.Activity;
import day3.exercises.exercise4.PlanElement;

public interface Plan {

	public void setScore(double score);
	public double getScore();
	
	public ArrayList<PlanElement> getPlanElements();
	
	public void addLeg(final Leg leg);
	
	public void addActivity(final Activity act);
}
