
public class Weather {
	public static void main(String args []) {
		int weatherF;
		weatherF = 70;
		
		if (weatherF == 0 || weatherF <= 55) {
				System.out.println("You will need a winter jacket to go outside.");
				 if(weatherF < 32) {
					 System.out.println("\nBelow freezing temperature outside.");
					 System.out.println("Make sure you dress appropriately for the weather outside.");
				 }
			}
		if (weatherF > 55 && weatherF <= 70) {
				System.out.println("A sweater or light jacket would work.");
				 if(weatherF == 70) {
					 System.out.println("Summer is almost here!");
				 }
			}
		if (weatherF > 70 && weatherF < 100) {
				System.out.println("Summer Time!");
			}
		
		if (weatherF > 100) {
				System.out.println("Extreme heat conditions. \nOpt for lightweight, light-coloured and loose fiiting clothing. ");
		}
	}
	
}
