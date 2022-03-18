
public class AppUser {
	public static void main(String[] args) {
		Application[] userApp = new Application[4];
		
		userApp[0] = new Application("Jack");
		userApp[1] = new Application("skelington", "1234");
		userApp[2] = new Application("Y2K", "2000", "Glitch-Bug");
		userApp[3] = new Application("JO0819", "08aug", "year", 1994);
		
		for (int i = 0; i <= userApp.length - 1; i++) {
			System.out.println(userApp[i]);
		}
	}
}
