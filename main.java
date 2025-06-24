import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		TextAnalyzer analyzer = new TextAnalyzer();
		Scanner sc = new Scanner(System.in);
        String text = "";

        try {
            System.out.print("Insert text: ");
            text = sc.nextLine();

            if (text.trim().isEmpty()) {
                throw new IllegalArgumentException("Text input cannot be blank");
            }
            
            int characterCount = analyzer.CharacterCount(text);
            System.out.println("Character count: " + characterCount);           
            int wordCount = analyzer.WordCount(text);
            System.out.println("Word count: " + wordCount); 
            char mostCommon = analyzer.MostCommonChar(text);
            System.out.println("Most common character: " + mostCommon); 
        } 
        catch (Exception e) {
            System.out.println("Error, insert a string (text) please.");
        } 
        finally {
            System.out.println("The program has finished.");
            sc.close();
        }
	}
}
