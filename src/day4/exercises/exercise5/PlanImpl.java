package day4.exercises.exercise5;

import java.util.ArrayList;

import day3.exercises.exercise4.Activity;
import day3.exercises.exercise4.PlanElement;

public class PlanImpl implements Plan {

	private double score;
	private ArrayList<PlanElement> planElements;	
	
	public PlanImpl(double score) {
		
		this.score = score;
		planElements = new ArrayList<PlanElement>();	
	}
	@Override
	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public double getScore() {
		return this.score;
	}

	@Override
	public ArrayList<PlanElement> getPlanElements() {
		return this.planElements;
	}

	@Override
	public void addLeg(Leg leg) {

		this.planElements.add(leg);
	}

	@Override
	public void addActivity(Activity act) {
		this.planElements.add(act);
	}

}
