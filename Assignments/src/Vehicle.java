
public class Vehicle {
		// Attributes
		int passengers;
		double tankCapacity;
		double fuelConsumption;
		String make;
		double tDist;
		double tTime;
		double range;
		double gasReq;
		double speed;
		
		/*
		 * Vehicle (double dist, double cap) { this.fuelConsumption = dist / cap; }
		 */
		
		
		
		
		//Instance
		double findMaxRange(double tCapacity, double fuelConsumption) {
				double tankCapacity = tCapacity * 3.785;
				double mpg = fuelConsumption;
				double maxRangeK = (tankCapacity / mpg) * 100;
				double maxRangeM = (maxRangeK / 1.609) * 2;
				return maxRangeM;
		}
		
		//Instance
		double findMPG(double fuelGiven) {
			double mpg = fuelGiven;
			return mpg;
		}
		
		//Instance
		double findGasNeeded(double gasReq) {
				double req = gasReq;
				return req;
		}
		
		//Instance - 
		double findSpeed(double d ,double t) {
			double speed = d / t;
			return speed;
		}
		
		// Main Method
		public static void main(String[] args) {
			// Object creation - Toyota
			Vehicle toyota = new Vehicle();
			System.out.println("Please enter Car make: ");
			toyota.make = "Toyota Tacoma";
			toyota.tankCapacity = 21.1; // uses 18 gallons before asking to refuel while only having 3 gallons left
			toyota.tDist = 500;
			toyota.fuelConsumption = toyota.tDist / toyota.tankCapacity; 
			toyota.gasReq = 3;
			System.out.println("Car make & model: " + toyota.make);
			System.out.println(toyota.make + " has a gas tank capacity of " + toyota.tankCapacity + " gallons");
			System.out.println("Toyota Tacoma has an average mpg: " + toyota.findMPG(toyota.fuelConsumption));
			System.out.println("Toyota Tacoma has a max range of " + toyota.findMaxRange(toyota.tankCapacity, toyota.fuelConsumption) + " miles on a full tank of gas.");
			System.out.println("The car requires to be refueled at " + toyota.findGasNeeded(toyota.gasReq) + " gallons.");
			
			System.out.println("\nHow many passengers are in the car: ");
			toyota.passengers = 3;
			System.out.println("Car has " + toyota.passengers + " passengers.");
			
			
		}
}
