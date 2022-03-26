package letsridepkg;

import java.util.Scanner;


public class Sample {
	public static void main(String[] args) {
		System.out.println("Welcome for a nice Drive!");
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Kindly Enter Your Name");
		String rdriver = s.nextLine();
		
		
		
		Driver ritik = new Driver();
		ritik.profile(rdriver);
		Car c;
		System.out.println("Want to Choose Car? " + "Press 0 for NO / 1 for YES");
		int carType = s.nextInt();
		if (carType == 1) {
			System.out.println("Enter Car name");
			String carName = s.next();
			c = new Car(carName);

		} else {
			c = new Car();
		}
		c.GetInTheCar(ritik);
		c.EnjobyBeverages();
		s.close();
	}
}
