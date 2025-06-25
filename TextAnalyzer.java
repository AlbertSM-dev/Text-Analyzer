import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class TextAnalyzer {

	public TextAnalyzer() {

	}
	
	public int CharacterCount(String Text) {
		 return Text.length();
	}
	
	public int WordCount(String Text) {
		int words = 1;
		
		for (int i = 0; i < Text.length(); i++) {
	        if (Text.charAt(i) == ' ') {
	            words++;
	        }
	    }	
		return words;
	}
	
	public char MostCommonChar(String Text){
		return Text.chars()
			.mapToObj(c -> (char) c)
	        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	        .entrySet()
	        .stream()
	        .max(Map.Entry.comparingByValue())
	        .map(Map.Entry::getKey)
	        .orElseThrow();
	}
	
	public int CharacterFrequency(char character, String Text) {
		int count = 0;
		
		for (int i = 0; i < Text.length(); i++) {
			if (Character.toLowerCase(character) == Text.toLowerCase().charAt(i)) {
				count++;
			}
		}
		return count;
	}
	
	public int WordFrequency(String Word, String Text) {
		int count = 0;
		String[] words = Text.split("\\s+");
		
		for (String w : words) {
		    if (w.toLowerCase().equals(Word.toLowerCase())) {
		        count++;
		    }
		}
		return count;
	}
	
	public int UniqueWords(String Text) {	
		String[] words = Text.split("\\s+");
		List<String> unique = new ArrayList<String>();
		
        for (String Word : words) {
            if (!unique.contains(Word)) {
                unique.add(Word);
            }
        }
        return unique.size();
	}
}
