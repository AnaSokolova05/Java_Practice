import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
		
			WordProcessor wordProcessor = new WordProcessor();

			System.out.print("Enter a sentence: ");
			String userInput = scanner.nextLine();
			
			int letterCount = wordProcessor.countLetters(userInput);
			System.out.println("Number of letters in the sentence: " + letterCount);

			int wordCount = wordProcessor.countWords(userInput);
			System.out.println("Number of words in the sentence: " + wordCount);
			
			int lengthCount = wordProcessor.getLength(userInput);
			System.out.println("Lenght of the sentence is: " + lengthCount);
		
      
	}

}
