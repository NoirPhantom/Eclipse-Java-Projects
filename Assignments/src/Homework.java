
public class Homework {
	public static void main(String args []) {
		int grade = 85;
		if (grade >= 75) {
			grade += 5;
			System.out.println(grade);
		} else {
			System.out.println("You passed Good Job!");
		}
		
		
		int $left = 95;
		if ($left <= 150 ) {
			System.out.println("Buy tickets");
		}
		else {
			System.out.println("Too Expensive");
		}
		
		String studentname = "Jonathan";
		float GPA = 3.6f;
		boolean honors = true;
		
		if (GPA >= 3.5 && honors == true) {
			System.out.println(studentname + "You have a degree with honors!");
		}
		else if (GPA < 3.5 && honors == false) {
			System.out.println(studentname + "You have a degree with no honors.");
		}
		
		
		// Chapter 5 - Question 2
		for (int num1 = 20; num1 <= 100; num1++) { 
			if(num1%2 == 0) {
			  System.out.println(num1 + " Even"); 
			  } else { 
				  System.out.println(num1 + " Odd"); 
				  } 
			}
		
		
		
		// Chapter 5 - Question 4
		//a - 90 loops
		//b 
		int add = 0;
		for (int b = 10; b <= 100; b++) {
			add = add + b;
			System.out.println("The sum of the integers from 10 to 100 is: " + add);
		}
		
		//c
		System.out.println();
		int i = 10;
		int sum = 0;
		
		do {
			sum = sum + i;
			System.out.println("The sum of the integers from 10 to 100 is: " + sum);
			i++;
		} while (i <= 100);
		
		
	}
}




// Question 7 a - e
/* 7a - true
   7b - false
   7c - true
   7d - true
   7e - true
*/