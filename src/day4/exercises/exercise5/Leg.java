package day4.exercises.exercise5;

import day3.exercises.exercise4.PlanElement;
import day3.exercises.exercise5.Vehicle;

public interface Leg extends PlanElement{

	public String getMode();
	public void setMode(String mode);
	
	public double getDepartureTime();
	public void setDepartureTime(final double seconds);
	
	public double getTravelTime();
	public void setTravelTime(final double seconds);
	
	public void setVehicle(Vehicle v);
	public Vehicle getVehicle();
	
}
