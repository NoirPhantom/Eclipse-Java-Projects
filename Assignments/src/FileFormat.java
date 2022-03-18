import java.util.Scanner;

public class FileFormat {

	public static void main(String[] args) {
		// Problem 5 - FileFormat
		System.out.println("-Problem 5-");
		Scanner size = new Scanner(System.in);
		Scanner format = new Scanner(System.in);
		System.out.println("Please input file format: ");
		// String fileFormat = "txt";
		String fileFormat = format.next();
		System.out.println("Please input file size: ");
		// int fileSize = 150;
		int fileSize = size.nextInt();

		if (fileFormat.equals("pdf")) {
			System.out.println("You have a PDF file.");
		} else if ((fileFormat.equals("jpeg") || fileFormat.equals("jpg") || fileFormat.equals("png"))
				&& fileSize <= 500) {
			System.out.println("you are printing an image and the size is within the max allowed value of 500MB.");
		} else if (fileFormat.equals("java")) {
			System.out.println("You are printing a java file.");
			if (fileSize > 100) {
				System.out.println("You are working on a large java program. Good going!");
			}
		} else if (fileFormat.equals("txt") || (fileFormat.equals("docx") && fileSize <= 100)) {
			System.out.println("You are printing a txt or docx file.");
		} else {
			System.out.println("The printer does not reconize the file format or file is too large.");
		}
		size.close();
		format.close();
	}

}
