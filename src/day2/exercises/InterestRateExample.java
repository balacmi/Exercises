package day2.exercises;

import java.util.Scanner;

public class InterestRateExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double currentAmount = input.nextDouble();
		double goalAmount = input.nextDouble();
		double interest = input.nextDouble();
		int years = 0;

		while (currentAmount < goalAmount) {
			currentAmount *= interest;
			years++;	
		}

		System.out.println("Number of years need is: " + years);

	}

}
